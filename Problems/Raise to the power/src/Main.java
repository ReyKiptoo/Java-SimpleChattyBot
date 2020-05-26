import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        long num = n;
        int i = 1;
        if (m == 0) {
            return 1;
        }
        while(i < m) {
            num *= n;
            i++;
        }
        return num;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));

    }
}