public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        try {
            double result = calculator.divide(10, 2);
            System.out.println("10 / 2 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double result = calculator.divide(7, 0);
            System.out.println("7 / 0 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
