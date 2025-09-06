package lab2;

import java.util.Scanner;

/**
 * Q5
 */
public class Q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter degrees in Celsius : ");
    double Celsuis = sc.nextDouble();

    double fahrenheit = Celsuis * (9.0 / 5) + 32;

    System.out.println("Degrees In Fahrenheit : " + fahrenheit);
  }
}
