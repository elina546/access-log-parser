import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Please enter the path:");
            String path = scanner.nextLine();
            File file = new File(path);

            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            // Debugging: Print the values of fileExists and isDirectory
            System.out.println("File exists: " + fileExists);
            System.out.println("Is directory: " + isDirectory);

            if (!fileExists || isDirectory)  {
                System.out.println("File doesn't exist or path is incorrect");
                continue;
            } else {
                n++;
                System.out.println("Path is correct" + '\n' + "File number is " + n);
            }
        }
    }
}



