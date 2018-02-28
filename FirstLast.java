import java.util.Scanner;
public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in) ;
	System.out.println("Enter a word");
	String text= scan.nextLine();
	System.out.println(SecondtoLast(text));
	}
	public static String SecondtoLast(String word) {
	char first= word.charAt(0);
	int index=word.length()-2;
	char AlmostLast= word.charAt(index);
	String firstandLast= first+""+AlmostLast;
	return firstandLast;
}
	}


