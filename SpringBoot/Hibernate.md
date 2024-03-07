Hibernate is a popular object-relational mapping (ORM) framework in Java, which simplifies database interactions by mapping Java objects to database tables. Here's a simplified explanation with examples:

Imagine you have a Java class representing a `Student`:

```java
public class Student {
    private int id;
    private String name;
    private int age;

    // Getters and setters
}
```

Now, let's say you have a corresponding database table called `students`. Traditionally, you'd need to write SQL queries to insert, update, delete, and retrieve data from this table. With Hibernate, you can map this class to the table and perform these operations without writing SQL queries directly.

Here's how you'd map the `Student` class to the `students` table using Hibernate:

```xml
<!-- Student.hbm.xml -->
<hibernate-mapping>
    <class name="Student" table="students">
        <id name="id" type="int">
            <generator class="increment"/>
        </id>
        <property name="name" type="string"/>
        <property name="age" type="int"/>
    </class>
</hibernate-mapping>
```

Now, let's see how you can use Hibernate to interact with the database:

1. **Insertion Example:**

```java
Student student = new Student();
student.setName("John Doe");
student.setAge(20);

Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();

session.save(student); // This will insert the student into the database

session.getTransaction().commit();
session.close();
```

2. **Retrieval Example:**

```java
Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();

List<Student> students = session.createQuery("from Student", Student.class).list();
for (Student student : students) {
    System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
}

session.getTransaction().commit();
session.close();
```

3. **Update Example:**

```java
Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();

Student student = session.get(Student.class, 1); // Assuming the student with ID 1 exists
student.setName("Jane Doe");
session.update(student); // This will update the student in the database

session.getTransaction().commit();
session.close();
```

4. **Deletion Example:**

```java
Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();

Student student = session.get(Student.class, 1); // Assuming the student with ID 1 exists
session.delete(student); // This will delete the student from the database

session.getTransaction().commit();
session.close();
```

In these examples, Hibernate handles the mapping between Java objects and database tables, making database interactions simpler and more intuitive for Java developers.