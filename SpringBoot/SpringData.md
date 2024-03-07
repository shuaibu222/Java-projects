Spring Data is a part of the Spring Framework that simplifies data access in Java applications. It provides a higher-level abstraction over data access technologies like JDBC, JPA, MongoDB, etc. Spring Boot, on the other hand, is a framework built on top of Spring that aims to simplify the process of creating and configuring Spring applications.

When you use Spring Boot with Spring Data, you can easily integrate data access into your application without writing a lot of boilerplate code. Here's a simplified explanation with examples:

1. **Setup**:
   In your Spring Boot project, include the necessary dependencies for Spring Data. For example, if you're using Spring Data JPA for accessing relational databases like MySQL or PostgreSQL, include the `spring-boot-starter-data-jpa` dependency.

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>
   ```

2. **Entity Class**:
   Define your entity classes. These are Java classes representing database tables. Annotate them with `@Entity` and specify fields with `@Column`.

   ```java
   @Entity
   public class User {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       
       @Column(nullable = false)
       private String name;
       
       // Getters and setters
   }
   ```

3. **Repository Interface**:
   Create a repository interface that extends `JpaRepository` or the appropriate Spring Data repository interface. You don't need to implement this interface; Spring Data generates the implementation for you at runtime.

   ```java
   public interface UserRepository extends JpaRepository<User, Long> {
       // Additional custom query methods can be declared here if needed
   }
   ```

4. **Usage**:
   You can now use the methods provided by the repository interface to interact with the database. Spring Data will handle the underlying database operations for you.

   ```java
   @Service
   public class UserService {
       private final UserRepository userRepository;
       
       public UserService(UserRepository userRepository) {
           this.userRepository = userRepository;
       }
       
       public User getUserById(Long id) {
           return userRepository.findById(id).orElse(null);
       }
       
       public List<User> getAllUsers() {
           return userRepository.findAll();
       }
       
       public User saveUser(User user) {
           return userRepository.save(user);
       }
       
       // Other business logic methods can be defined here
   }
   ```

5. **Configuration**:
   Spring Boot auto-configures the data source based on your `application.properties` or `application.yml` file. You might need to configure additional properties depending on your database setup.

   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/mydatabase
       username: root
       password: password
       driver-class-name: com.mysql.cj.jdbc.Driver
   ```

That's it! With Spring Boot and Spring Data, you can focus more on writing business logic and less on managing data access code.