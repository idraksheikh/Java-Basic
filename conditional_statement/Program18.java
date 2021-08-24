package classFile;
import java.util.Scanner;
public class Program18{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter URL of any website :-");
		String url=scan.nextLine();
		
		//Printing sum 
		if(url.endsWith(".com")){
			System.out.println("It's a Commercial website.");
		}
		else if(url.endsWith(".in")){
			System.out.println("It's an Indian website.");
		}
		else if(url.endsWith(".org")){
			System.out.println("It's a Organisation website.");
		}
		else{
			System.out.println("It is some other website.");	
		}
	}
}