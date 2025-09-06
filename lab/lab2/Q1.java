package lab2;

import java.util.Scanner;

/**
 * Q1
 */
public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println();

    System.out.println("user value: " + num);
    System.out.println();

    System.out.println("Post-increment 'num++': " + (num++));
    System.out.println("After post-increment: " + num);
    System.out.println("Pre-increment '++num': " + (++num));
    System.out.println();

    System.out.println("Post-decrement 'num--': " + (num--));
    System.out.println("After post-decrement: " + num);
    System.out.println("Pre-decrement '--num': " + (--num));
    System.out.println();
  }
}
