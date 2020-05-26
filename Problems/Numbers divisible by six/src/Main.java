import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < length; i++)
        {
            int num = scanner.nextInt();
            if (num % 6 == 0)
            {
              sum += num;
            }

        }
        System.out.println(sum);
    }
}