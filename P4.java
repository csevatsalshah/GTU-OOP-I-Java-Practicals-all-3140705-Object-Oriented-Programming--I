import java.util.Scanner;
class P4 {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Weight In Pounds :");
    double weight = input.nextDouble();
    System.out.print("Enter Height In Inches :");
    double height = input.nextDouble();
	  double kweight = weight*0.45359237;
	  double mheight = height*0.0254;
	  double bmi = kweight/(mheight*mheight);
    System.out.print(bmi);
  }
}
