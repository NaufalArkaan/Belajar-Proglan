import java.io.*;

public class Delete {
    public static void main(String[] args) {
        try {
            File inputFile = new File("data.txt");
            File tempFile = new File("temp.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile));

            String lineToRemove = "John Doe, 1234, 3";
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (!line.equals(lineToRemove)){
                    printWriter.println(line);
                }
            }
            printWriter.close();
            bufferedReader.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Data berhasil dihapus");
        } catch (IOException e) {
            System.out.println("Exception Occurred");
        }
    }
}
