import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int dailyRise = scanner.nextInt();
        int dailyFall = scanner.nextInt();
        int increase = (dailyRise - dailyFall);
        int day = 0;
        int currentLevel = 0;

        LOOP : while (currentLevel < height) {
            currentLevel += increase;
            day++;
            if (currentLevel > height){
                System.out.print(day);
            }
            else if(currentLevel == height)
            {
                System.out.print(day);
                break LOOP;
            }
            else if((currentLevel + dailyRise) == height) {
                System.out.println(day + 1);
                break LOOP;
            }

            else if((currentLevel + dailyRise) > height) {
                System.out.println(day + 1);
                break LOOP;
            }

        }

    }
}
