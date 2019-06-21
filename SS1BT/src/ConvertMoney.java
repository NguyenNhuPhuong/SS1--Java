
import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        System.out.println("Menu.");
        System.out.println("1. USD ---> VND");
        System.out.println("2. VND ---> USD");
        System.out.println("0. Exit");
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter choose type : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money number exchange : ");
                    int number1 = sc.nextInt();
                    int VND = number1 * 23000;
                    System.out.println ("VND is: " + VND);
                    break;
                case 2:
                    System.out.print("Enter money number exchange : ");
                    int number2 = sc.nextInt();
                    int USD = number2 / 23000;
                    System.out.println("USD is: " + USD);
                    break;
                default:
                    System.out.println("Not changer to money, please try again1");
            }
        }while (choice != 0);
    }
}
