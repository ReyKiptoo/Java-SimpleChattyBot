import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int previous = firstNumber;
        boolean increasing = false;
        boolean ordered = true;

        while (scanner.hasNext()) {
            int secondNumber = scanner.nextInt();
            if (secondNumber == 0) {
                break;
            } else if (secondNumber == previous) {
                continue;
            } else if (secondNumber < previous) {
                increasing = false;
                previous = secondNumber;
                break;
            } else {
                increasing = true;
                previous = secondNumber;
                break;

            }
        }
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            else if (increasing && number < previous) {
                ordered = false;
            } else if (!increasing && number > previous){
                ordered = false;
            } else {
                previous = number;
            }
        }

        if (ordered) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
