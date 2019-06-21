import java.util.Scanner;

public class Readnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        String number = sc.nextLine();
        readNumber(number);
    }

    private static void readNumber(String number) {
        int faceNumber = Integer.parseInt(number);
        if (faceNumber < 0) {
            System.out.print("Nhập lại số cần đọc");
        } else {
            if (faceNumber <= 10) {
                if (faceNumber == 10) {
                    System.out.print("Ten");
                    return;
                }
                Number(number);
            } else if (faceNumber <= 20) {
                towNumber1(faceNumber);
            } else if (faceNumber < 100) {
                towNumber2(faceNumber);
            } else if (faceNumber < 1000) {
                threeNumber(number);
            } else {
                System.out.print(" chưa làm đọc được trên 1000 :D ");
            }
        }

    }

    private static void Number(String number) {
        switch (number.charAt(0)) {
            case '0':
                System.out.print(" zero ");
            case '1':
                System.out.print(" one ");
                break;
            case '2':
                System.out.print(" two ");
                break;
            case '3':
                System.out.print(" three ");
                break;
            case '4':
                System.out.print(" four ");
                break;
            case '5':
                System.out.print(" five ");
                break;
            case '6':
                System.out.print(" six ");
                break;
            case '7':
                System.out.print(" seven ");
                break;
            case '8':
                System.out.print(" eight ");
                break;
            case '9':
                System.out.print(" nine ");
                break;
        }
    }

    private static void towNumber1(int number) {
        switch (number) {
            case 11:
                System.out.print(" eleven ");
                break;
            case 12:
                System.out.print(" twelve ");
                break;
            case 13:
                System.out.print(" thirteen ");
                break;
            case 14:
                System.out.print(" fourteen ");
                break;
            case 15:
                System.out.print(" fiveteen ");
                break;
            case 16:
                System.out.print(" sixteen ");
                break;
            case 17:
                System.out.print(" seventeen ");
                break;
            case 18:
                System.out.print(" eighten ");
                break;
            case 19:
                System.out.print(" nineteen ");
                break;
            case 20:
                System.out.print(" twenty ");
                break;
        }
    }

    private static void towNumber2(int number) {
        String tens = "", units = "";
        switch (String.valueOf(number).charAt(0)) {
            case '2':
                tens = " tewn";
                break;
            case '3':
                tens = " thir";
                break;
            case '4':
                tens = " for";
                break;
            case '5':
                tens = " five";
                break;
            case '6':
                tens = " six";
                break;
            case '7':
                tens = " seven";
                break;
            case '8':
                tens = " eight";
                break;
            case '9':
                tens = " nine";
                break;

        }
        switch (String.valueOf(number).charAt(1)) {
            case '0':
                units = "";
                break;
            case '1':
                units = " one ";
                break;
            case '2':
                units = " two ";
                break;
            case '3':
                units = " three ";
                break;
            case '4':
                units = " four ";
                break;
            case '5':
                units = " five ";
                break;
            case '6':
                units = " six ";
                break;
            case '7':
                units = " seven ";
                break;
            case '8':
                units = " eight ";
                break;
            case '9':
                units = " nine ";
                break;

        }
        System.out.println(tens + "ty" + units);
    }

    private static void threeNumber(String number) {
        String num1 = Character.toString(number.charAt(0));
        Number(num1);
        System.out.print(" hundred and ");
        String str = number.substring(1);
        int num = Integer.parseInt(str);
        if (number.charAt(1) == '1') {
            towNumber1(num);
        } else {
            towNumber2(num);
        }
    }
}