//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String firstInput = input.next();
        String secondInput = input.next();
        String thirdInput = input.next();

        String switcher;
        switcher = firstInput;
        firstInput = thirdInput;
        thirdInput = switcher;

        System.out.println(firstInput);
        System.out.println(secondInput);
        System.out.println(thirdInput);
    }
}