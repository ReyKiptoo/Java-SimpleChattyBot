import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean willNotCrash = true;
        for (int i = 1; i <= numberOfBridges; i++) {
            int bridge = scanner.nextInt();
            if ((bridge - N) <= 0) {
                System.out.println("Will crash on bridge " + i);
                willNotCrash = false;
                break;
            }
        }
        if (willNotCrash) {
            System.out.println("Will not crash");
        }
    }
}


    