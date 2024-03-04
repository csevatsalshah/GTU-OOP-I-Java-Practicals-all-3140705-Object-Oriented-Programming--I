public class P7 {
    public static void main(String[] args) {
    
        int letter1 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter2 = 'A' + (int)(Math.random() * ('Z' - 'A'));
        int letter3 = 'A' + (int)(Math.random() * ('Z' - 'A'));

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random()* 10);
        int num3 = (int)(Math.random()* 10);
        int num4 = (int)(Math.random()* 10);

        System.out.println("" + (char)(letter1) + (char)(letter2) + (char)(letter3) + (int)(num1)+ (int)(num2)+ (int)(num3)+ (int)(num4));
    }
}
