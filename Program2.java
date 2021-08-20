package classFile;
import java.util.Scanner;
public class Program2{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		System.out.println("please enter the marks of subject 1");
		int subject1=scan.nextInt();
		System.out.println("please enter the marks of subject 2");
		int subject2=scan.nextInt();
		System.out.println("please enter the marks of subject 3");
		int subject3=scan.nextInt();
		// doing sum
		int sum=subject1+subject2+subject3;
		float cgpa=(sum/300f)*10f;//f is for float 
		//Printing sum 
		System.out.println("The cgpa you got  is : "+cgpa);//+is to concate the string with variable.
	}
}