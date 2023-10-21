public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Expression is undefined.");
        }
        return (double) x / y;
    }
}
