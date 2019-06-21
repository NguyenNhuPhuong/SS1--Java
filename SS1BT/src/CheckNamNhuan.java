
import java.util.Scanner;

public class CheckNamNhuan {
    public static void main(String[] args) {
        boolean isLeapYear = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        boolean isDivisibleBy4 = year % 4 == 0;

        if (isDivisibleBy4){
          boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            }
            else{
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.print(" %d is a leap year " + year);
        }else{
            System.out.print(" %d in not a leap year " + year );
        }
    }
}
