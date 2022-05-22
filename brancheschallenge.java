import java.util.Scanner;

public class BranchesChallenge {
    public static void main() {
        Scanner scnr = new Scanner(System.in);

        int degrees = scnr.nextInt();

        if ((degrees <= 20) && (degrees > 15)) {
            System.out.println("It's not a good day to go to the beach");
        }
        else if (degrees < 15) {
            System.out.println("It's way too cold!");
        }
        else if (degrees > 20) {
            System.out.println("It's a good day to go to the beach");
        }
        else {
            System.out.println("Please input a number");
        }
   }
}


// Question: What if the input is "12"?
// Answer: It's way too cold!