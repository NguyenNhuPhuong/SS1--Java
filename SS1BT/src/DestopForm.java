import java.util.Scanner;

public class DestopForm {
    public static void main(String[] args) {
        System.out.println("1. Tam Giac nguoc");
        System.out.println("2. Retangle");
        System.out.println("3. tam giac ");
        System.out.println("4. Vuong ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter form wanted ");
        int number = input.nextInt();
        form(number);
    }

    private static void form(int number) {
        switch (number) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    System.out.print(" * \n");

                    if (i == 5) {
                        break;
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                }
                break;
            case 2:
                for (int i = 0; i <= 3; i++) {
                    System.out.print(" \n ");
                    System.out.print(" * ");
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                }
                break;
            case 3:
                for(int i = 6; i >= 0;i--){
                    System.out.print("\n");
                    System.out.print(" * ");
                    for (int j = 1; j <=i; j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 4:
        }

    }

}
