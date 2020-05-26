import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        boolean firstIsPositive = (first > 0) && (second <= 0) && (third <= 0);
        boolean secondIsPositive = (first <= 0) && (second > 0) && (third <= 0);
        boolean thirdIsPositive = (first <= 0) && (second <= 0) && (third > 0);

        System.out.println(firstIsPositive || secondIsPositive || thirdIsPositive);
    }
}