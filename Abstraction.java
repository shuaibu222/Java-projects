/*
 * Abstract class cannot be instantiated as a new instance.
 */
abstract class Abstraction {

    // Abstract cannot have body but implemented by other classes
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }

    public static void main(String[] args) {
        Sheep sh = new Sheep();
        sh.animalSound();
        sh.sleep();
    }
}

/**
 * Sheep
 */
class Sheep extends Abstraction {
    public void animalSound(){
        System.out.println("beee beee beee beee beee beee beee beee beee beee beee!.");
    }
}
