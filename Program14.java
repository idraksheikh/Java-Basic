package classFile;
import java.util.Scanner;
public class Program14{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("Please enter your marks you obtain in Hindi");
		int hindi=scan.nextInt();
		System.out.println("Please enter your marks you obtain in English");
		int english=scan.nextInt();
		System.out.println("Please enter your marks you obtain in Maths");
		int maths=scan.nextInt();
		// doing sum
		int total=hindi+english+maths;
		//Printing sum 
		float percentage=total/3f;
		if((percentage<40)||(maths<33)||(hindi<33)||(english<33)){
			System.out.println("You are Fail");
		}
		else{
			{
			System.out.println("You are Passed !");
			System.out.println("You percentage is : "+percentage);
		}
		}
	}
}