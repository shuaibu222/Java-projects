/*
 * Generics in Java provide a way to create classes, interfaces, and methods that operate with parameters. 
 * They allow you to define classes and methods with placeholder types, which are specified when the classes, 
 * interfaces, or methods are used. Generics provide compile-time type safety and help in writing reusable code.
 */

class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setContent(10);
        System.out.println("Integer Box Content: " + intBox.getContent());

        // Creating a Box for String
        Box<String> strBox = new Box<>();
        strBox.setContent("Hello, Generics!");
        System.out.println("String Box Content: " + strBox.getContent());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setContent(3.14);
        System.out.println("Double Box Content: " + doubleBox.getContent());

        // Creating a Box for a custom class
        Box<Person> personBox = new Box<>();
        personBox.setContent(new Person("John", 25));
        System.out.println("Person Box Content: " + personBox.getContent());
    }
}

// A simple class representing a Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person { name='" + name + "', age=" + age + " }";
    }
}
