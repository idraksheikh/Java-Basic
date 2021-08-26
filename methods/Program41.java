package classFile;
import java.util.Scanner;

public class Program41{

	public static void tempCon(float tempC){
		float tempF=(tempC*9f/5f)+32f;
		System.out.println("The temperature in Farhenit is : "+tempF);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the temperature in Celcius");
		float tempC=scan.nextFloat();
		tempCon(tempC);
	}
}