public class Encapsulation {

    /* 
    * Accessible only within the class since it's private
    * (i.e 'ENCAPSULATION': accessing private attr from other classes using getters and setters
    which give more control over the attributes and improves security).
    */
    private String name;
    private int age;

    // it's possible to access private attributes if we utilize getters and setters.

    // Getters
    public String nameGetter(){
        return name;
    }
    public int ageGetter(){
        return age;
    }

    // Setters
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods
    public void fullThrottle(){
        System.out.println("The car is running fast as it can!.");
    }

    public void speed(int maxSpeed){
        System.out.printf("Max speed is: %d\n", maxSpeed);
    }

    // Main entry point to be executed
    public static void main(String[] args) {
        Encapsulation myCar = new Encapsulation();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
