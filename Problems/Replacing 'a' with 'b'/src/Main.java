import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        String newText = text.replace('a' , 'b');
        System.out.println(newText);
    }
}