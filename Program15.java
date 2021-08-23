package classFile;
import java.util.Scanner;
public class Program15{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter income per annum :-");
		int income=scan.nextInt();
		float tax;
		//Printing sum 
		if((income<250000)&&(income>=0)){
			System.out.println("You do not need to pay tax. ");
		}
		else if((income>=250000)&&(income<500000)){
			tax=income*0.05f;
			System.out.println("The amount of tax you have to pay is :- "+tax);
		}
		else if((income>=500000)&&(income<=1000000)){
			tax=income*0.2f;
			System.out.println("The amount of tax you have to pay is :- "+tax);
		}
		else if(income>1000000){
			
			tax=income*0.3f;
			System.out.println("The amount of tax you have to pay is :- "+tax);
		
		}
		else{
			System.out.println("Please enter valid income.");	
		}
	}
}