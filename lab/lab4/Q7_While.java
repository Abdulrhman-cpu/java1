import java.util.Scanner;

public class Q7_While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int number;

    System.out.println("Enter numbers (enter 0 to stop):");

    number = scanner.nextInt();

    // Using while loop
    while (number != 0) {
      sum += number;
      number = scanner.nextInt();
    }

    System.out.println("Sum of all entered numbers: " + sum);

    scanner.close();
  }
}
