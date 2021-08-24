package classFile;
import java.util.Scanner;
public class Program20{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to which you want sum of even Number :-");
		int n=scan.nextInt();
		int sum=0,i=1;
		while(i<=n){
			sum+=2*i;
			i++;
		}	
		System.out.println("The sum of "+n+" Even numbers are :- "+sum);
	}
}