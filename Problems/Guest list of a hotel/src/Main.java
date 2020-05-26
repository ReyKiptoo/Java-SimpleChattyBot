//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner keyboard = new Scanner(System.in);
        var firstInput = keyboard.nextLine();
        var secondInput = keyboard.nextLine();
        var thirdInput = keyboard.nextLine();
        var fourthInput = keyboard.nextLine();

        var switcher = firstInput;
        var switcher2 = secondInput;

        firstInput = fourthInput;
        secondInput = thirdInput;
        thirdInput = switcher2;
        fourthInput = firstInput;

        System.out.println(firstInput);
        System.out.println(secondInput);
        System.out.println(thirdInput);
        System.out.println(fourthInput);
    }
}