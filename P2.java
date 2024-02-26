import java.util.Scanner;
class P2 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Values from Equestion:- 1 :");
    System.out.print("The value of a is: ");
    double a = input.nextDouble();
    System.out.print("The value of b is: ");
    double b = input.nextDouble();
    System.out.print("The value of e is: ");
    double e = input.nextDouble();

    System.out.println("Values from Equestion:- 2 :");
    System.out.print("The value of c is: ");
    double c = input.nextDouble();
    System.out.print("The value of d is: ");
    double d = input.nextDouble();
    System.out.print("The value of f is: ");
    double f = input.nextDouble();

    double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
    double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

    System.out.print(" X = " + x + " Y = " + y);

  }
}
