/**
 * Grade
 */
public class Grade {

  public static void main(String[] args) {
    int Grade = 180;

    System.out.println("Your Grade is : " + Grade);
    if (Grade >= 60 && Grade <= 100) {
      System.out.println("You Pass");
    } else if (Grade < 60) {
      System.out.println("You Failed");
    } else {
      System.out.println("OUT OF BOUNDS");
    }
  }
}
