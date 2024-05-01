Sure! Design patterns are reusable solutions to common problems encountered in software design. They provide a template for solving particular issues and promote code reusability, flexibility, and maintainability. Here are some examples of design patterns commonly used in Object-Oriented Programming (OOP) design using Java:

1. **Singleton Pattern**:
   - Purpose: Ensure that a class has only one instance and provides a global point of access to that instance.
   - Example: Java's `java.lang.Runtime` is a singleton class. Another example could be a Logger class.
   ```java
   public class Singleton {
       private static Singleton instance;

       private Singleton() {} // Private constructor

       public static Singleton getInstance() {
           if (instance == null) {
               instance = new Singleton();
           }
           return instance;
       }
   }
   ```

2. **Factory Pattern**:
   - Purpose: Define an interface for creating an object, but let subclasses decide which class to instantiate. It provides a way to delegate the instantiation logic to child classes.
   - Example: `java.util.Calendar` is an example of a factory pattern in Java.
   ```java
   public interface Shape {
       void draw();
   }

   public class Circle implements Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Circle");
       }
   }

   public class Square implements Shape {
       @Override
       public void draw() {
           System.out.println("Drawing Square");
       }
   }

   public class ShapeFactory {
       public Shape getShape(String shapeType) {
           if (shapeType == null) {
               return null;
           }
           if (shapeType.equalsIgnoreCase("CIRCLE")) {
               return new Circle();
           } else if (shapeType.equalsIgnoreCase("SQUARE")) {
               return new Square();
           }
           return null;
       }
   }
   ```

3. **Observer Pattern**:
   - Purpose: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - Example: Java's `java.util.Observer` and `java.util.Observable` classes implement the observer pattern.
   ```java
   import java.util.Observable;
   import java.util.Observer;

   public class WeatherData extends Observable {
       private float temperature;

       public void setTemperature(float temperature) {
           this.temperature = temperature;
           setChanged(); // Marks the object as changed
           notifyObservers(); // Notifies all observers of the change
       }

       public float getTemperature() {
           return temperature;
       }
   }

   public class Display implements Observer {
       @Override
       public void update(Observable o, Object arg) {
           if (o instanceof WeatherData) {
               WeatherData weatherData = (WeatherData) o;
               float temperature = weatherData.getTemperature();
               System.out.println("Temperature updated: " + temperature);
           }
       }
   }
   ```

These are just a few examples, and there are many more design patterns like Builder, Prototype, Adapter, Decorator, etc., each solving different design problems. Understanding and applying these patterns can significantly improve the quality and maintainability of your codebase.