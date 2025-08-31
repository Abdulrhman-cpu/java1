/**
 * random
 */
public class random {

  public static void main(String[] args) {
    int NumberToGuess = (int) (Math.random() * 11);
    int UserGuess = 4;

    String result = (UserGuess == NumberToGuess) ? "! GOOD !" : "WRONG";

    System.out.println("USER GUESS :" + result);

    int SysGuess = 0;

    if (UserGuess == NumberToGuess) {
      SysGuess = 11;
    }

    System.out.println("SYSTEM TRING..");
    while (SysGuess <= 10) {
      if (SysGuess == NumberToGuess) {
        System.out.print("the right number is : " + SysGuess);
        break;
      }
      SysGuess++;
      System.out.println(SysGuess);
    }
  }
}
