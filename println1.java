public class println {
  public static void main(String[] args) {
    int Age = 20, YearsToAdd = 10;

    /*
     * print your age will be
     * print user age + yearsToAdd
     * print years old
     */

    System.out.println("Your age now : " + Age);
    System.out.println("in " + YearsToAdd + " years ur age will be");

    int sum = Age + YearsToAdd;

    System.out.print("\'" + sum + "\'");
    System.out.print(" years old");
  }
}
