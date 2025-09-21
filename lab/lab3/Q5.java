import java.util.Scanner;
public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("input an integer : ");
    int userInput = sc.nextInt();

    if(userInput % 2 == 0){
      System.out.println("Even");
    } else{
      System.out.println("Odd");
    }

  }
}
