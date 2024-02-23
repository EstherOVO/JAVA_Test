package test01;

public class MathUtility {

    public static int getMax(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        }
        return max;
    }

    public static int getMin(int a, int b) {
        int min = 0;
        if (a > b) {
            min = b;
        } else if (a < b) {
            min = a;
        }
        return min;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
