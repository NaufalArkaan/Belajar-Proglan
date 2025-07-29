/**
 * Kelas CircleCalculator digunakan untuk menghitung
 * luas dan keliling lingkaran berdasarkan jari-jari.
 *
 * <p>Contoh penggunaan:</p>
 * <pre>
 * CircleCalculator circle = new CircleCalculator(7);
 * double area = circle.getArea();
 * double circumference = circle.getCircumference();
 * </pre>
 *
 * @author Naufal
 * @version 1.0
 */
public class CircleCalculator {
    private double radius;

    /**
     * Konstruktor untuk membuat objek CircleCalculator
     * @param radius jari-jari lingkaran
     */
    public CircleCalculator(double radius) {
        this.radius = radius;
    }

    /**
     * Mengembalikan nilai jari-jari lingkaran.
     * @return jari-jari lingkaran
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Menghitung luas lingkaran.
     * Rumus: π * r * r
     * @return luas lingkaran
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Menghitung keliling lingkaran.
     * Rumus: 2 * π * r
     * @return keliling lingkaran
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Menentukan apakah lingkaran kecil atau besar.
     * @return "Kecil" jika radius < 10, "Besar" jika >= 10
     */
    public String getSizeCategory() {
        return (radius < 10) ? "Kecil" : "Besar";
    }

    /**
     * Program utama untuk menjalankan contoh perhitungan.
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator(7);
        System.out.println("Jari-jari: " + circle.getRadius());
        System.out.println("Luas     : " + circle.getArea());
        System.out.println("Keliling : " + circle.getCircumference());
        System.out.println("Kategori Lingkaran : " + circle.getSizeCategory());
    }
}
