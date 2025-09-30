import java.util.Scanner;

public class Q5_While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    long factorial = 1;
    int i = 1;

    // Using while loop
    while (i <= n) {
      factorial *= i;
      i++;
    }

    System.out.println("Factorial of " + n + " is: " + factorial);

    scanner.close();
  }
}
