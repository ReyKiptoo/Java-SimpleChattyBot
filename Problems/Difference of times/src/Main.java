import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var hours = scanner.nextInt();
        var minutes = scanner.nextInt();
        var seconds = scanner.nextInt();

        // Other time

        var HOURS = scanner.nextInt();
        var MINUTES = scanner.nextInt();
        var SECONDS = scanner.nextInt();

        var difference = ((HOURS * 3600) + (MINUTES * 60) + SECONDS) - ((hours * 3600) + (minutes * 60) + seconds);
        System.out.println(difference);
    }
}