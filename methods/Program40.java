package classFile;
import java.util.Scanner;

public class Program40{
	public static int i=1,j=1;
	
	public static void pattern4(int num){
		if(num==0){
			int x=0;
		}
		else{
			if(i<=j){
				System.out.print(" * ");
				i++;
				pattern4(num);
			}
			else{
			System.out.println("");
			i=1;
			j++;
			pattern4(num-1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the length of the pattern");
		int n=scan.nextInt();
		pattern4(n);
	}
}