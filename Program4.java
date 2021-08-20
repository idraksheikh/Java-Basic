package classFile;
import java.util.Scanner;
public class Program4{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);

		//logic

		//take input form users
		System.out.println("Please enter distance in Kilometer");
		float disKilo=scan.nextInt();
		float disMiles=(0.621f*disKilo);
		
		//Printing greetings
		System.out.println("Entered distance in Kilometer is : "+disKilo);
		System.out.println("Converted distance in Miles is : "+disMiles);

	}
}