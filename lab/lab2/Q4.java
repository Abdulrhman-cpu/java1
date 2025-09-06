package lab2;

import java.util.Scanner;

/**
 * Q4
 */
public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = sc.nextDouble();
    System.out.print("Enter second number: ");
    double b = sc.nextDouble();

    System.out.println("\nadding n1 + n2 = " + (a + b));
    System.out.println("\nsubstracting n1 - n2 = " + (a - b));
    System.out.println("\nmultiplying n1 * n2 = " + (a * b));
    if (b != 0) {
      System.out.println("\ndividing n1 / n2 = " + (a / b));
      System.out.println("\nreminder n1 % n2 = " + (a % b));
    }
  }
}
