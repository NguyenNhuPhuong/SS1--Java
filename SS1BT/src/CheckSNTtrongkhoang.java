import java.util.Scanner;

public class CheckSNTtrongkhoang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tim so ngt trong khoang tu: ");
        int number = input.nextInt();
        checkSNT(number);


    }

    private static void checkSNT(int number) {
        int count = 0;
        int n = 2;

        do {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                }

            }
            if (flag) {
                if (n < number)
                    System.out.print(n + " ");
                count++;

            }
            n++;

        } while (count < number);
    }
}
