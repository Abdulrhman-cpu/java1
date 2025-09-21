import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second numbers: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third numbers: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("Largest is: " + num1);
            } else {
                System.out.println("Largest is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("Largest is: " + num2);
            } else {
                System.out.println("Largest is: " + num3);
            }
        }
    }
}

