package classFile;
import java.util.Scanner;
public class Program1{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		// doing sum
		int sum=a+b+c;
		//Printing sum 
		System.out.println("The sum is"+sum);//+is to concate the string with variable.
	}
}