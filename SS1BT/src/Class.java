import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, count;
        System.out.print("Enter a number");
        number = input.nextInt();
        count = 1;
        while (count < number){
            System.out.println(count + ", ");
            count++;
        }
        System.out.print("BOOMMMMM ! ");
    }
}
