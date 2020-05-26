//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        var firsName = input.next();
        var age = input.nextInt();
        var stageOfEducation = input.next();
        var yearsOfExperience = input.nextInt();
        var cuisinePreference = input.next();

        System.out.println("The form for " + firsName + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference +" dishes.");
    }
}