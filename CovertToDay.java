import java.util.Scanner;
    public class CovertToDay {
        public static void main(String args[]){

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Year : ");
            int year = scan.nextInt();
            System.out.print("Enter Month : ");
            int month = scan.nextInt();
            System.out.print("Enter Day : ");
            int day = scan.nextInt();

            int sumDay = 0;
            switch(month){
                case 12:
                    sumDay += 30;
                case 11:
                    sumDay += 31;
                case 10:
                    sumDay += 30;
                case 9:
                    sumDay += 31;
                case 8:
                    sumDay += 31;
                case 7:
                    sumDay += 30;
                case 6:
                    sumDay += 31;
                case 5:
                    sumDay += 30;
                case 4:
                    sumDay += 31;
                case 3:
                  if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
                    sumDay += 29;
                  }else{
                    sumDay += 28;
                  }
                case 2:
                    sumDay += 31;
                case 1:
                    sumDay += day;
           
            }
        System.out.println("Date : " + month + "-" + day + "-" + year + "-->" +sumDay + "Days");


        }
    }                
           
        