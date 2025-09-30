import java.util.Scanner;

public class Q6_While {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    boolean isPrime = true;

    if (n <= 1) {
      isPrime = false;
    } else {
      int i = 2;

      // Using while loop
      while (i <= Math.sqrt(n)) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
        i++;
      }
    }

    if (isPrime) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number.");
    }

    scanner.close();
  }
}
