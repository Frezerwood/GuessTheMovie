import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "D:\\IdeaProjects\\JavaProjects\\UdacityGuessTheMovie\\src\\movieList.txt";
            Path myPath = Path.of(filePath);
            Scanner scanner = new Scanner(myPath);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("BigErrors");
            e.printStackTrace();
        }

    }
}
