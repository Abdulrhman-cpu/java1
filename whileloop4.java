/**
 * whileloop
 */
public class whileloop {

  public static void main(String[] args) {
    int age = 20;
    int count = 0;

    do {
      System.out.print(".");
      count++;
    } while (count < age);

    System.out.print("\nYour counted age = " + count);
  }
}
