package classFile;
import java.util.Scanner;

public class Program33{
	public static void table(int num){
		for(int i=1;i<=10;i++){
			System.out.printf("%d X %d = %d",num,i,(num*i));
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to print the table.");
		int num=scan.nextInt();
		table(num);
	}
}