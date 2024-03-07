
import java.util.*;

public class Main {

    public static int tokens = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        if (s.trim().isEmpty()){
            System.out.println("0");
        } else {
            String[] splitted = s.trim().split("[\\s+',:?@!_.]+");
        
        System.out.println(splitted.length);

        for (String sp : splitted) {
            System.out.println(sp);
            tokens++;
        }
        }
        scan.close();
    }
}

