package classFile;
import java.util.Scanner;
public class Program5{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);

		//logic

		//take input form users
		System.out.println("Please enter any number");
		boolean status=scan.hasNextInt();//its checks whether the number entered is int is not and return boolean value
		if(status){
			System.out.println("The entered number is an integer");	
		}
		else{
			System.out.println("The entered number is not an integer");	
		
		}
		
		

	}
}