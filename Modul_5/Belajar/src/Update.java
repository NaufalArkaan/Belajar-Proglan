import java.io.FileWriter;
import java.io.IOException;

public class Update {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("data.txt", true);
            fileWriter.write("John Doe, 1234, 3");
            fileWriter.close();
            System.out.println("Data berhasil ditambahkan!");
        } catch (IOException e) {
            throw new RuntimeException("Exception Occurred");
        }
    }
}
