import java.nio.file.Files;
import java.nio.file.Path;

public class IOstreams {

    public static void main(String[] args) {
        Path path = Path.of("/home/shuaibu/Downloads/test.txt");
        
        try {
            String s = Files.readString(path);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}