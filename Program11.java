package classFile;
import java.util.Scanner;
public class Program11{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter any string :-");
		String  str1=scan.nextLine();
		// converting string to lowercase
		String changeStr1=str1.replace(" ","_");
		//Printing
		System.out.println("The original string is: "+str1);
		System.out.println("The replaced string is: "+changeStr1);
	}
}