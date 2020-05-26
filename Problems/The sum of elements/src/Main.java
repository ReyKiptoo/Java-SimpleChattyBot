import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum;
        int total = 0;
        do {
            sum = scanner.nextInt();
            total+=sum;
        }
        while(sum != 0);

        System.out.println(total);
    }
}