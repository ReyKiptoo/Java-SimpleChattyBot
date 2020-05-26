import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean endsWithBurg = text.endsWith("burg");
        System.out.println(endsWithBurg);
    }
}