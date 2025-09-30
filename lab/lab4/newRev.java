import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    int x = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int rev = num;

    for (int i = 0; num % (Math.pow(10, i)) != num; i++) {
      x *= 10;
      x += (rev % 10);
      rev /= 10;
    }

    // System.out.println("rev = " + x);
  }
}
