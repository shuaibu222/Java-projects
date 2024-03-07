public class Encapsulation {

    /* 
    * 'ENCAPSULATION': accessing private attr from other classes using getters and setters
    which give more control over the attributes and improves security.
    */
        private double balance; // Encapsulated attribute
    
        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited successfully.");
            }
        }
    
        // Method to withdraw money
        public void withdraw(double amount) {
            if (balance >= amount && amount > 0) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    
        // Getter method to access balance
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {

            // Usage
            Encapsulation account = new Encapsulation();
            account.deposit(1300);
            account.withdraw(500);
            System.out.println("Current balance: " + account.getBalance());
        }
    }
    

