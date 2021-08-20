package classFile;
import java.util.Scanner;
public class Program3{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter your good name");
		String name=scan.nextLine();
		
		//Printing greetings
		System.out.println("Hello "+name.toUpperCase()+" ! Have good day.");//+is to concate the string with variable.
	}
}