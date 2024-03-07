    public class Inheritance {
      /*
       * 'INHERITANCE'
       * 
       * Final classes and methods cannot be inherited
       * Constructor can't be inherited unless super() keyword utilized
      */
        // private String brand = "Ford"; // private cannot be inherited
        protected String brand = "Ford";
        public void honk() {             
            System.out.println("Tuut, tuut!");
        }
    }
    
    
    class Car extends Inheritance {
        private String modelName = "Mustang"; // accessible only to the Car class
        public static void main(String[] args) {
            
          // Create a myCar object
            Car myCar = new Car();
            myCar.honk();
    
          // Accessed brand attribute from the vehicle class because it's protected.
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }
