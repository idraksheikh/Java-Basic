package classFile;
import java.util.Scanner;
public class Program23{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to print factorial of :-");
		int n=scan.nextInt();
		int fact=1;
		int i=1;
		while(i<=n){
			fact*=i;
			i++;
		}	
		System.out.println("The factorial of "+n+" is  :- "+fact);
		
	}
}