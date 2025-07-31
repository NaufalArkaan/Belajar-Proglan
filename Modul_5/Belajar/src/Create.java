import java.io.*;

public class Create {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("data.txt");
            fileWriter.write("Nama, NIM, Semester \n");
            fileWriter.close();
            System.out.println("File berhasil dibuat");
        } catch (IOException e) {
            System.out.println("Exception Occurred");
        }
    }
}
