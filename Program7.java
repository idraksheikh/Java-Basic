package classFile;
import java.util.Scanner;
public class Program7{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		//take input form users
		char  grade=scan.next().charAt(0);
		// Encrypt
		grade+=8;
		//Printing 
		System.out.println("The Encrypted grade is : "+grade);
		//Decrypt
		grade-=8;
		//Printing 
		System.out.println("The Decrypted grade is : "+grade);
	}
}