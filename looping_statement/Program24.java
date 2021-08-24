package classFile;
import java.util.Scanner;
public class Program24{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number  :-");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
			if(i%8==0){
				sum+=i;
			}
		}	
		System.out.println("The sum of numbers between 1 and "+n+" is  :- "+sum);
		
	}
}