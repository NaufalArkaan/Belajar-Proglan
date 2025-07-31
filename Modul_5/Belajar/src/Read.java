import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try{
            File file = new File("data.txt");
            Scanner dataReader = new Scanner(file);

            while (dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception Occurred");
        }
    }
}
