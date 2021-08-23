package classFile;
import java.util.Scanner;
public class Program16{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter number from 1 to 7 :-");
		int day=scan.nextInt();
		
		switch(day){
			case 1 :
				{
					System.out.println("You have selected Monday.");
					break;
				}
			case 2 :
				{
					System.out.println("You have selected Tuesday.");
					break;
				}
			case 3 :
				{
					System.out.println("You have selected Wednesday.");
					break;
				}
			case 4 :
				{
					System.out.println("You have selected Thursday.");
					break;
				}
			case 5 :
				{
					System.out.println("You have selected Friday.");
					break;
				}
			case 6 :
				{
					System.out.println("You have selected Saturday.");
					break;
				}
			case 7 :
				{
					System.out.println("You have selected Sunday.");
					break;
				}
			default :{
					System.out.println("Please enter correct number between 1 -7, Thanks.");
			}
		}
		
	}
}