import java.util.Scanner;

public class Q4_For {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int start = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int end = scanner.nextInt();

    System.out.println("Even numbers in the range [" + start + ", " + end + "]:");

    // Using for loop
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    scanner.close();
  }
}
