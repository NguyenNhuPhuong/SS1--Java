import java.util.Scanner;
public class AppBank {
    public static void main(String[] args) {
        // tinh lai suat cua ngan hang theo thang
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank  for lending ");
        double Numberloan = sc.nextDouble();
        System.out.println("Enter month");
        double Numbermonth = sc.nextDouble();
        System.out.println("Enter bank rate");
        double Numberrate = sc.nextDouble();
        double totalrate = 0;
        for(int i = 0; i < Numbermonth; i ++){
            totalrate = Numberloan* (Numberrate/100)/12 * Numbermonth;
        }
        System.out.print("Total interset: " + totalrate);
    }
}
