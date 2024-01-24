import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOstreams {


    public static void readWithNIO() {
        // Specify the path of the file
        String filePath = "Main.java";

        try {
            // Read all lines from the file into a List
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*
         * InputStream is a class from java.io that let us manipulate files
         */

        readWithNIO();

        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
