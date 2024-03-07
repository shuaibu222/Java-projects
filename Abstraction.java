abstract class Abstraction {
    abstract void abstractMethod(); // Abstract method

    void concreteMethod() { // Concrete method
        System.out.println("Concrete method in abstract class");
    }
}

interface InterfaceExample {
    void abstractMethod(); // Abstract method

    // Compilation error: Interfaces cannot have instance variables
    int instanceVariable = 10;
}

class ConcreteClass extends Abstraction {

    public static void main(String[] args) {
        
    }

    @Override
    void abstractMethod() {
        System.out.println("Concrete implementation of abstract method");
    }
}

// Compilation error: ConcreteClass must implement abstractMethod
class ConcreteClassWithInterface implements InterfaceExample {
    // Concrete implementation of abstractMethod
    @Override
    public void abstractMethod() { // can't reduce the visibility of the method either the same or greater
        System.out.println("Concrete implementation of abstract method");
    }
}
