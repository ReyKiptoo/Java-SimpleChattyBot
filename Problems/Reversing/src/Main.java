import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();

        int newNumber = returnWithoutZerosInTheEnd(number);
        int nnLength = (int) (Math.log10(newNumber)) + 1;

        if (newNumber < 10)
        {
            System.out.print(newNumber);
        }
        else
        {
            for (int i = 0; i < nnLength; i++)
            {
                int digit = newNumber % 10;
                System.out.print(digit);
                newNumber /= 10;
            }
        }
    }

    public static int returnWithoutZerosInTheEnd(int num)
    {
        while((num % 10) == 0)
        {
            num = num /10;
        }
        return num;
    }
}