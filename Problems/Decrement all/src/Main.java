import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        --first;
        --second;
        --third;
        --fourth;
        System.out.print(first + " "+ second+" "+third+" "+fourth);
    }
}