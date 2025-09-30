import java.util.Scanner;

public class Q5_DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    long factorial = 1;
    int i = 1;

    // Using do-while loop
    if (n > 0) {
      do {
        factorial *= i;
        i++;
      } while (i <= n);
    }

    System.out.println("Factorial of " + n + " is: " + factorial);

    scanner.close();
  }
}
