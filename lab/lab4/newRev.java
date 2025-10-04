import java.util.Scanner;

public class newRev {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int zeros = 0;

    for (int j = num; j % 10 == 0;) {
      zeros++;
      j /= 10;
    }

    int rev = 0;
    while (num != 0) {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num /= 10;
    }

    System.out.print("rev = ");
    for (int x = 0; x < zeros; x++) {
      System.out.print(0);
    }
    System.out.print(rev);
    sc.close();
  }
}
