import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MahasiswaData {
    public static void main(String[] args) {
        List<String[]> data = Arrays.asList(
                new String[] {"Andi", "11119", "1"},
                new String[]{"Bima", "11112", "1"},
                new String[]{"Rahma", "11131", "3"},
                new String[]{"Zeno", "11198", "9"},
                new String[]{"Rahma", "11131", "3"},
                new String[]{"Andi", "11119", "1"}
        );

        Set<String> uniqueData = new LinkedHashSet<>();
        for (String[] row : data){
            uniqueData.add(String.join(",", row));
        }

        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Nama,NIM,Semester\n");
            for(String line : uniqueData){
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("Data berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
    }
}
