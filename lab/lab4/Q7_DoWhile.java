import java.util.Scanner;

public class Q7_DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int number;

    System.out.println("Enter numbers (enter 0 to stop):");

    // Using do-while loop
    do {
      number = scanner.nextInt();

      if (number != 0) {
        sum += number;
      }
    } while (number != 0);

    System.out.println("Sum of all entered numbers: " + sum);

    scanner.close();
  }
}
