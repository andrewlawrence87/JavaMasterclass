package NumberFunctions;

/**
 * Created by Andrew on 24-May-18.
 */
public class Series {
    public static int nSum(int n) {
        int output = 0;
        for (int i = 0; i <= n; i++) {
            output += i;
        }
        return output;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }

    public static int fibonacci(int n) {
        int[] numbers = new int[n+1];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i <= (n); i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n];
    }
}
