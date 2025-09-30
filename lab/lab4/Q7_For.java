import java.util.Scanner;

public class Q7_For {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int number;

    System.out.println("Enter numbers (enter 0 to stop):");

    // Using for loop with infinite condition
    for (;;) {
      number = scanner.nextInt();

      if (number == 0) {
        break;
      }

      sum += number;
    }

    System.out.println("Sum of all entered numbers: " + sum);

    scanner.close();
  }
}
