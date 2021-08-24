package classFile;
import java.util.Scanner;
public class Program17{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter any year :-");
		int year=scan.nextInt();
		
		//Printing sum 
		if(year%4==0){			
			if(year%100==0){			
				if(year%400==0){			
					System.out.println("The year "+year+" is a leap year.");		
				}		
				else{
					System.out.println("The year "+year+" is not a leap year.");	
				}
			}		
			else{
				System.out.println("The year "+year+" is a leap year.");	
			}
		}		
		else{
			System.out.println("The year "+year+" is not a leap year.");	
		}
	}
}