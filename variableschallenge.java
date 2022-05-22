import java.util.Scanner;

public class variables{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please input a height and a radius in meters.");
        int height = scnr.nextInt();
        int radius = scnr.nextInt();
    
        int volume;

        volume = (height/3) * Math.PI * Math.pow(radius,2);

        System.out.print("The volume of your cone is: " + volume);

    }
    

}

// Question: If the input is "2 4", what is the output closest to?
// Answer: The volume of your cone is: The volume of your cone is: 34


