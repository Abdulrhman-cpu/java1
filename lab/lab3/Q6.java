import java.util.Scanner;
public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Age: ");
    int age = sc.nextInt();

    if (age <= 2) {
        System.out.println("infant");
    } else if (age <= 13) {
        System.out.println("child");
    } else if (age <= 18) {
        System.out.println("teenager");
    } else if (age <= 64) {
        System.out.println("adult");
    } else {
        System.out.println("senior"); }
  }
}
