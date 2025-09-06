/**
 * methods
 */
public class methods {

  static boolean myMethod(String fname, int age) {
    for (int i = 0; i <= age; i++) {
      System.out.print(".");
    }
    if (age >= 18) {
      System.out.println(fname + " is " + age + " can't play");
      return false;
    } else {

      System.out.print(fname + " ");
      System.out.println(age);
      return true;
    }
  }

  public static void main(String[] args) {
    myMethod("lyla", 19);
    myMethod("Maryam", 11);
    myMethod("sara", 8);
    myMethod("nora", 31);

    boolean test = myMethod("me", 10);

    if (test) {
      System.out.println(" You Can Play ");
    }
  }
}
