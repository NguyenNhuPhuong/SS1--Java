
import java.util.Scanner;

public class KT {
    public static void Number(String number) {
        switch (number.charAt(0)) {
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
        }
    }

    public static void NumbersWTwoNumb(int number) {
        switch (number) {
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("Sixteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("Eighteen");
                break;
            case 19:
                System.out.print("Nineteen");
                break;
            case 20:
                System.out.print("Twenty");
                break;
        }
    }

    public static void NumbersWTwoNumb1(int number) {
        String tens = "", ones = "";
        String s = String.valueOf(number);
        switch (s.charAt(0)) {
            case '2':
                tens = "twen";
                break;
            case '3':
                tens = "thir";
                break;
            case '4':
                tens = "for";
                break;
            case '5':
                tens = "fif";
                break;
            case '6':
                tens = "six";
                break;
            case '7':
                tens = "seven";
                break;
            case '8':
                tens = "eigh";
                break;
            case '9':
                tens = "nine";
                break;
        }
        switch (s.charAt(1)) {
            case '0':
                ones = "";
                break;
            case '1':
                ones = "one";
                break;
            case '2':
                ones = "two";
                break;
            case '3':
                ones = "three";
                break;
            case '4':
                ones = "four";
                break;
            case '5':
                ones = "five";
                break;
            case '6':
                ones = "six";
                break;
            case '7':
                ones = "seven";
                break;
            case '8':
                ones = "eight";
                break;
            case '9':
                ones = "nine";
                break;
        }
        System.out.print(tens + "ty " + ones);
    }

    public static void NumbersWThreeNumb(String number) {
        String s = Character.toString(number.charAt(0)); // ?
        Number(s);
        System.out.print("hundred and ");
        String str = number.substring(1); // ?
        int num = Integer.parseInt(str);
        if (number.charAt(1) == '1') {
            NumbersWTwoNumb(num);
        } else {
            NumbersWTwoNumb1(num);
        }
    }

    public static void readNumbersIntoWords(String number) {
        int number1 = Integer.parseInt(number);
        if (number1 <= 0) {
            System.out.println("Nhap lai so can doc");
        } else {
            if (number1 <= 10) {
                if (number1 == 10) {
                    System.out.println("Ten");
                    return;
                }
                Number(number);
            } else if (number1 <= 20) {
                NumbersWTwoNumb(number1);
            } else if (number1 < 100) {
                NumbersWTwoNumb1(number1);
            } else if (number1 < 1000) {
                NumbersWThreeNumb(number);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc ");
        String number = scanner.nextLine();
        readNumbersIntoWords(number);
    }
}