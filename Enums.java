enum  ConstantVars { // i.e it's attr are constant which is equal to final keyword but it's like a class
    EAT,
    SLEEP,
    SOUND
}

class TestEnums {

        // class attributes
        ConstantVars work;
    
        // constructor for Main class
        TestEnums(ConstantVars work){
            this.work = work;
        }

    

        // using it in switch statement
        public void speak() {
            switch (work) {
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


// file class
public class Enums {

    // methods of Main class
    public double calculate(double x, double y){
        return x + y;
    }

    static void minus(int n1, int n2){
        System.out.printf("Result is: %d\n", n1 - n2);
    }


    public static void main(String[] args){
        

        // implement the encapsulation file here
        Encapsulation myCar = new Encapsulation();
        // setters and getters
        myCar.setter("Shuaibu", 24);
        System.out.println(myCar.nameGetter());
        System.out.println(myCar.ageGetter());

        // use enums constant with switch statement
        TestEnums myEnums = new TestEnums(ConstantVars.SOUND);
        myEnums.speak();

    }
}