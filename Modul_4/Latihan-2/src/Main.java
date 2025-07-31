import java.util.Scanner;

/**
 * Program Text Analyzer sederhana.
 * Menganalisis teks: jumlah karakter, kata, dan pencarian kata.
 *
 * @author Naufal
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = "";
        int pilihan;

        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();  // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    teks = input.nextLine();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    if (teks.isEmpty()) {
                        System.out.println("Teks belum dimasukkan.");
                    } else {
                        System.out.println("Jumlah karakter dalam teks: " + teks.length());
                    }
                    break;
                case 3:
                    if (teks.isEmpty()) {
                        System.out.println("Teks belum dimasukkan.");
                    } else {
                        String[] kataArray = teks.trim().split("\\s+");
                        System.out.println("Jumlah kata dalam teks: " + kataArray.length);
                    }
                    break;
                case 4:
                    if (teks.isEmpty()) {
                        System.out.println("Teks belum dimasukkan.");
                    } else {
                        System.out.print("Masukkan kata yang ingin dicari: ");
                        String kataDicari = input.nextLine();
                        String[] kataArray = teks.split("\\s+");
                        int jumlahDitemukan = 0;
                        for (String kata : kataArray) {
                            if (kata.equalsIgnoreCase(kataDicari)) {
                                jumlahDitemukan++;
                            }
                        }
                        System.out.println("Kata '" + kataDicari + "' ditemukan sebanyak " + jumlahDitemukan + " kali dalam teks.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();  // spasi antar menu
        } while (pilihan != 5);

        input.close();
    }
}
