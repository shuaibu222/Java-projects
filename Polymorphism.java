/*
 * We are trying to achieve 'POLYMORPHISM': ability of an object to take many forms.
 * 
 * Here we use animalSound() from animal class to all other classes with different message.
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