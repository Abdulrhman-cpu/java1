import java.util.Scanner;

public class Q3_For {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int start = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int end = scanner.nextInt();

    System.out.println("Numbers in the range [" + start + ", " + end + "]:");

    // Using for loop
    for (int i = start; i <= end; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    scanner.close();
  }
}
