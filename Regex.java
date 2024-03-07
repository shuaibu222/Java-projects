import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String regex = "/* Write a RegEx matching repeated words here. */";
        Pattern p = Pattern.compile(regex, 1 );

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("", "");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}