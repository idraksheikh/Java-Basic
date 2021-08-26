package classFile;
import java.util.Scanner;

public class Program38{
	public static void average(int ...num){
		int sum=0;
		float avg;	
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		avg=(float)sum/num.length;
		System.out.println("The average of numbers entered is : "+avg);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many number you want to enter.");
		int n=scan.nextInt();
		System.out.println("Please enter "+n+" numbers.");
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		average(num);
	}
}