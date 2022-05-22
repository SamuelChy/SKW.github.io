import java.util.Scanner;
public class YearOfDays {
 public static void main(String[] args) {
   int days;
   System.out.println("Input start year:");
   Scanner s = new Scanner(System.in);
   int y0 = s.nextInt();
   System.out.println("\nInput end year:");
   s = new Scanner(System.in);
   int y1 = s.nextInt();
   if (y1 > y0) {
     for (int i = y0; i <= y1; i++) {
       if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
         days = 366;
       }
         else {
           days = 365;
         }
         System.out.println("Year: " + i + " = " + days);
       }
       
     }
   else {
     System.out.println("End year must be greater than first year!");
   }
 }

}

/*    input start year: 2011
      Input end year: 2014

      Year: 2011 = 365
      Year: 2012 = 366
      Year: 2013 = 365
      Year: 2014 = 365
*/
