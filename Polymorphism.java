/*
 * We are trying to achieve 'POLYMORPHISM': which is utilizing methods and attributes
 * of joint classes by inheritance, to achieve reusable attr & methods.
 * 
 * Here we use animalSound() from animal class to all other classes with different tasks.
 */

public class Polymorphism {

    // can't override final method in polymorphism
    public void animalSound(){
        System.out.println("animal makes sound!.");
    }

    // Just to execute(test) the 'POLYMORPHISM' feature
    public static void main(String[] args) {
        Cat cat = new Cat(); /// polymorphic variable cat & goat.
        Goat goat = new Goat();
        cat.animalSound();
        cat.eatFood();
        goat.animalSound();
    }
}

class Cat extends Polymorphism implements FoodInterface { // class can only extend from one superclass
    
    @Override
    public void animalSound(){
        System.out.println("Cat says: meow meow meow meow meow meow meow.........");
    }

    public void eatFood(){
        System.out.println("Cat's eating!");
    }
}

class Goat extends Polymorphism {

    // @Override
    public void animalSound(){
        System.out.println("Goat says: beee beee beee beee beee beee beee........");
    }
}