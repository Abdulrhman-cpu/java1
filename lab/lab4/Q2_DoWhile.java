import java.util.Scanner;

public class Q2_DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number N: ");
    int n = scanner.nextInt();

    int sum = 0;
    int i = 1;

    // Using do-while loop
    if (n > 0) {
      do {
        sum += i;
        i++;
      } while (i <= n);
    }

    System.out.println("Sum of natural numbers up to " + n + " is: " + sum);

    scanner.close();
  }
}
