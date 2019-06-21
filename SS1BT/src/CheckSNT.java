

import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number prime ");
        int number = sc.nextInt();
        checkPrime(number);
    }

    private static void checkPrime(int number) {

        int count = 1, n = 2;
        do {
            boolean flag = true;
            if (n < 2) {
                System.out.print(" is Not prime ");
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                if(n < number) {
                    System.out.print(n + " ");
                    count += 1;
                }
            }
            n++;
        } while (count < number);
    }
}
