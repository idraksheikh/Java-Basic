package classFile;
import java.util.Scanner;
public class Program12{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter your good name :-");
		String  name=scan.nextLine();
		String letter="Dear <|name|>, Thanks a lot.";
		// converting string to lowercase
		String changeStr1=letter.replace("<|name|>",name);
		//Printing
		
		System.out.println(changeStr1);
	}
}