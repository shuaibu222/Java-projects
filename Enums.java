public class Enums {

    /*
     * Enums are like classes but can't be instantiated and its attr are constants
     */

    interface speak {
        public void speakThree();
    }

    enum ev implements speak { // i.e list of constant which is equal to final keyword
        EAT("Eat"),
        SLEEP("Sleep"),
        SOUND("Sound");

        private String params;

        ev (String param){
            this.params = param;
        }

        @Override
        public void speakThree() {
            switch (this) {
                case EAT:
                    System.out.println("I'm eating!.");
                    break;
                case SLEEP:
                    System.out.println("I'm sleeping!.");
                    break;
                case SOUND:
                    System.out.println("Woooooooooooooooow!.");
                    break;
                default:
                    break;
            }
        }
    }

    // class attributes
    final int y;
    String firstName;

    // constructor for Main class
    public Enums(int g){
        y = g;
        firstName = "Shuaibu";
    }

    // methods of Main class
    public double calculate(double x, double y){
        return x + y;
    }

    static void minus(int n1, int n2){
        System.out.printf("Result is: %d\n", n1 - n2);
    }

    public static void main(String[] args){
        
        Encapsulation myCar = new Encapsulation();
        // enum assignment
        // enum assignment
        for (ev s : ev.values()){
            System.out.println(s.name() + ": " + s.params);
        }


        // setters and getters
        myCar.setter("Shuaibu", 24);
        System.out.println(myCar.nameGetter());
        System.out.println(myCar.ageGetter());

    }
}