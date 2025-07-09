import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;

        try{
            System.out.println("Masukan angka: ");
            a = scan.nextInt();
            if(a <= 0){
                throw new Exception("Angka tidak boleh <= 0");
            }else{
                System.out.println("Angka yang anda masukan adalah: " + a);
            }
        }catch (Exception e){
            System.out.println("Eror: " + e.getMessage());
        }
    }
}
