package classFile;
import java.util.Scanner;
public class Program27{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of students :-");
		int len=scan.nextInt();
		float avg;
		int sum=0;
		
		System.out.println("Please enter the marks of "+len+" students in Physics :-");
		int[] marks=new int[len];
		for(int i=0;i<len;i++){
			marks[i]=scan.nextInt();			
			sum+=marks[i];
		}
		avg=(float)sum/len;
		System.out.println("The average of the marks obtained by students in Physics "+avg);
	
	}
}