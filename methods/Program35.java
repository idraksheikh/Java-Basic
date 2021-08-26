package classFile;
import java.util.Scanner;

public class Program35{
	public  int naturalSum(int num){
		if(num==1){
			return 1;
		}
		else{
			return num+(naturalSum(num-1));
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to which you want to print the sum of natural numbers.");
		int num=scan.nextInt();
		Program35 obj=new Program35();
		
		System.out.println("The sum of "+num+" natural numbers are :- "+obj.naturalSum(num));
	}
}