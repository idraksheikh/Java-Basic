package classFile;
import java.util.Scanner;
public class Program8{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);

		int givenNo= 21;
		System.out.println("Please enter the number");	
		//take input form users
		int userNo=scan.nextInt();
		//logic
		if(givenNo==userNo){
			System.out.println("The given number and the user number both are same");	
		}
		else if(givenNo>=userNo){
			System.out.println("The given number is greater   than the user number");	
		}
		else {
			System.out.println("The user number is greater   than the given number");	
		}
		
	}
}