import java.util.Scanner;
public class reverse {
  public static int x = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int rev = num;


    for (int i = 1; num % (Math.pow(10, i) / 10) != num; i++){

      addrev(rev);
      rev /= 10;
    }

    System.out.println("rev = " + x);
  }

  static int findLast(int num){
    return num % 10;
  }

  static void addrev(int rev){
    x *= 10;
    x += findLast(rev);
  }
}
