import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println("The number is " + n);

        input.close();
    }
}