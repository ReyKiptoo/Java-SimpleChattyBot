import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (K < (N * M))
        {
            boolean horizontalBreak = ((K % N) == 0);
            boolean verticalBreak = ((K % M) == 0);

            if (horizontalBreak || verticalBreak)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
            System.out.println("NO");

    }
}