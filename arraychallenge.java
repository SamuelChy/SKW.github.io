import java.util.Scanner; 

public class ArrayChallenge {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[10];     

      int userInts;
      int i = 0;
      int seventhNum;

      userInts = scnr.nextInt();

      while ((userInts >=0)) {
         userValues[i] = userInts;
         userInts = scnr.nextInt();     
         i = i + 1;
      }
     
      if (i > 10) {
         System.out.println("Too many numbers");
      }
      else {
         System.out.println("Seventh Number: " + userValues[seventhNum]);
      }
   }
}

// Question: What if the input is "23 546 76 23 456 87 54 23 90 8754 34"?
// Answer: Too many numbers

