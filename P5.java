import java.util.Scanner;
class P5 {
  public static void main(String[] args) {
    int temp;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter The Value of 1st Integer :");
    int a = input.nextInt();
    System.out.print("Enter The Value of 2nd Integer :");
    int b = input.nextInt();
    if (a < b) {
      temp = a;
      a = b;
      b = temp;
    }
    System.out.print("Enter The Value of 3rd Integer :");
    int c = input.nextInt();
    if (c > b) {
      if (c > a) {
        temp = c;
        c = b;
        b = a;
        a = temp;
      } else {
        temp = c;
        c = b;
        b = temp;
      }
    }
    System.out.print("Decreasing Order :" + a + " " + b + " " + c);
  }
}
