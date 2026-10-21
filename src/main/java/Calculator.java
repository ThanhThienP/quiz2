public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Ints cannot be divded by zero");
        return a / b;
    }

    public boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public int[] incrementArrays(int[] values) {
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i] + 1;
        }
        return newValues;
    }
}
