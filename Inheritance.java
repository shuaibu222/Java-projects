    public class Inheritance {
      /*
       * 'INHERITANCE'
      */
        protected String brand = "Ford"; // private which can only be accessible within the class and subclasses(which extends)
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
