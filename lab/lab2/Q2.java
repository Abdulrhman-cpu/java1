package lab2;

import java.util.Scanner;

/**
 * Q2
 */
public class Q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    num += 5;
    System.out.println("After adding 5: " + num);
  }
}
