package classFile;
import java.util.Scanner;
public class Program25{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 5 float values :-");
		float[] num=new float[5];
		float sum=0;
		for(int i=0;i<5;i++){
			num[i]=scan.nextFloat();
			sum+=num[i];
		}
		System.out.println("The sum of float values are :- "+sum);
		
	}
}