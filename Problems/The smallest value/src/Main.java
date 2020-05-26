import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long M = scanner.nextLong();
        int n = 1;
        long total = 1;

        for (int i = 1; i <= n; i++)
        {
            total *= i;

            if (total <= M){
                n++;
            }
            else
                System.out.println(n);
        }
    }
}