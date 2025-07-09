public class modul1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            arr[5] = 25;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi eror indeks diluar batas!");
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program selesai.");
    }
}
