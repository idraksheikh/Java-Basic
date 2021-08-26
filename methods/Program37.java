package classFile;
import java.util.Scanner;

public class Program37{
	public  void fibo(int fnum,int snum,int num){
		if(num==0){
			int x=0;
		}
		else{
			
			int temp=snum;
			snum=fnum+snum;
			fnum=temp;
			System.out.print(" "+snum);	
			fibo(fnum,snum,num-1);
			
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number to which you want to print the Fibonacci series.");
		int n=scan.nextInt();
		Program37 obj=new Program37();
		System.out.println("The Fibonacci series is as follows :-");
		System.out.print(" 0 1");
		obj.fibo(0,1,n-2);
		
	}
}