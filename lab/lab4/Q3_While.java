import java.util.Scanner;

public class Q3_While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int start = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int end = scanner.nextInt();

    System.out.println("Numbers in the range [" + start + ", " + end + "]:");

    int i = start;

    // Using while loop
    while (i <= end) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    scanner.close();
  }
}
