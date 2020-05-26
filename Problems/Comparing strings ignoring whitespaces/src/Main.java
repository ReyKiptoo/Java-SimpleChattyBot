import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().trim().replace(" ", "");
        String second = scanner.nextLine().trim().replace(" ", "");

        boolean equal = first.equals(second);
        System.out.println(equal);
    }
}