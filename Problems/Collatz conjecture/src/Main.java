import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        if (num == 1)
        {
            System.out.print(1);
        }
        while(num != 1) {

            if (num % 2 == 0) {
                System.out.print(num + " ");
                num = num / 2;
                if (num == 1){
                    System.out.print(1);
                }
            }
            else {
                System.out.print(num + " ");
                num = num * 3 + 1;
                if (num == 1)
                {
                    System.out.print(1);
                }
            }
        }
    }
}