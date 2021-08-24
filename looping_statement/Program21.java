package classFile;
import java.util.Scanner;
public class Program21{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to print its multiplication table :-");
		int n=scan.nextInt();
		
		for(int i=1; i<=10;i++){
			System.out.printf(" %d X %d = %d",n,i,(n*i));
			System.out.println("");

		}	
		
	}
}