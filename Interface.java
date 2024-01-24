/**
 * Animal
 */

 // Interfaces


public class Interface {
    public static void main(String[] args) {
        BeautifulCat cat =  new BeautifulCat();
        cat.animalSound();
        cat.sleep();
        cat.eatFood();
    }
}

// must implement all of the methods in the interface to fullfill the interface

class BeautifulCat implements AnimalInterface, FoodInterface { // class can implements as many interfaces as they want
    public void animalSound() {
        System.out.println("meow meow meow meow meow!.");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void eatFood(){
        System.out.println("I'm eating food!.");
    }
}