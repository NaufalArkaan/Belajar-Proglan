public class Circle {
    private double r;

    public Circle(double radius){
        this.setR(radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        double phi = 3.14;
        System.out.println("Radius: " + circle.getR());
        System.out.println("Area: " + getArea(phi, circle));
    }

    private static double getArea(double phi, Circle circle) {
        return phi * circle.getR() * circle.getR();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
