import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name ");
        String Name  = sc.nextLine();
        System.out.println("Hello " + Name);
    }
}
