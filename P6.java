import java.util.Scanner;
public class P6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		char ch = input.next().charAt(0);
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print("This Character is Vowel. ");
				break;
			default:
				System.out.print("This Character constant ");		
		}
	}
}
