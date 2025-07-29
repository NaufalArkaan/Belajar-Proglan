import java.util.Scanner;

/**
 *
 * @author Naufal
 * @version 1.0
 */

public class Main {

    public static long factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Faktorial tidak bisa bernilai negatif");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        while (true){
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            pilihan = scan.nextInt();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan angka: ");
                    double angka1 = scan.nextDouble();
                    double hasilAkar = Math.sqrt(angka1);
                    System.out.println("Hasil akar kuadrat dari " + angka1 + " adalah " + hasilAkar);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double angka2 = scan.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double pangkat = scan.nextDouble();
                    double hasilPangkat = Math.pow(angka2, pangkat);
                    System.out.println(angka2 + " pangkat " + pangkat + " adalah " + hasilPangkat);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double angka3 = scan.nextDouble();
                    double hasilLog = Math.log(angka3);
                    System.out.println("Logaritma natural dari " + angka3 + " adalah " + hasilLog);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int angka4 = scan.nextInt();
                    long hasilFaktorial = factorial(angka4);
                    System.out.println("Faktorial dari " + angka4 + " adalah " + hasilFaktorial);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
