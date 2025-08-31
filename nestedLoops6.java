/**
 * nestedLoops
 */
public class nestedLoops {

  public static void main(String[] args) {
    for (int o = 1; o <= 3; o++) {
      for (int i = 1; i <= 3; i++) {
        System.out.print(" ");

        for (int j = 1; j <= 3; j++) {
          System.out.print(j);
        }
      }
      System.out.println("\n");
    }
  }
}
