package classFile;
import java.util.Scanner;

public class Program39{
	public static int i=1;
	public static void pattern3(int num){
		if(num==0){
			int x=0;
		}
		else{
			if(i<=num){
				System.out.print(" * ");
				i++;
				pattern3(num);
			}
			else{
			System.out.println("");
			i=1;
			pattern3(num-1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the length of the pattern");
		int n=scan.nextInt();
		pattern3(n);
	}
}