/*
 * 'POLYMORPHISM': ability of an object to take many forms.
 * 
 * Types:
 * 
 * 1) Compile-time/static polymorphism: is where class has multiple constructors 
 * with different types or return types(i.e Method Overloading).
 * 
 * 2) Runtime Polymorphism: is where sub-class overrides the method from super-class(i.e Method Overriding)
 * with the help of dynamic method dispatch
 * 
 * final keyword prevents overriding methods and inheritance
 * 
 */

public class Polymorphism {

    // Just to execute(test) the 'POLYMORPHISM' feature
    public static void main(String[] args) {
        Cat cat = new Cat(); /// polymorphic variable cat & goat.
        ExtendedClassToBe goat = new Goat(); // ExtendedClassToBe refrenced and Goat object.

        // dynamic binding: is using the method of the superclass by subclass(i.e the one that extends)
        cat.animalSound();
        cat.eatFood();
        goat.animalSound();

        // Method overloading(i.e compile-time polymorphism)
        InnerPolymorphism innerWithoutParameter = new InnerPolymorphism();
        System.out.println(innerWithoutParameter.getter());
        InnerPolymorphism innerWithParameter = new InnerPolymorphism(20);
        System.out.println(innerWithParameter.getter());
    
    }
}

/**
 * InnerPolymorphism
 */
class InnerPolymorphism {

    private int value;

    InnerPolymorphism() {}

    InnerPolymorphism(int ivalue) {
        this.value = ivalue;
    }

    public int getter() {
        return value;
    }
    
}



class ExtendedClassToBe {

    // can't override final method in polymorphism
    public void animalSound(){
        System.out.println("animal makes sound!.");
    }
}

class Cat extends ExtendedClassToBe implements FoodInterface { // class can only extend from one superclass
    
    // @Override
    public void animalSound(){
        System.out.println("Cat says: meow meow meow meow meow meow");
    }

    public void eatFood(){
        System.out.println("Cat's eating!");
    }
}

class Goat extends ExtendedClassToBe {

    // @Override
    public void animalSound(){
        super.animalSound(); // invoke super method too
        System.out.println("Goat says: beee beee beee beee beee");
    }
}