import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        int integer = ch;
        if (((integer == 65) || (integer == 69) || (integer == 73) || (integer == 79) || (integer == 85) || (integer == 97) || (integer == 101) || (integer == 105) || (integer == 111) || (integer == 117) )) {
            return true;
        }
        else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}