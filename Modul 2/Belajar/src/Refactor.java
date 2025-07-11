public class Refactor {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = getSum(a, b);
        int difference = getDifference(a, b);
        int multiplication = getMultiplication(a, b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiplication);
    }

    private static int getMultiplication(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    private static int getDifference(int a, int b) {
        int difference = a - b;
        return difference;
    }

    private static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
