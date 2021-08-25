package classFile;
import java.util.Scanner;
public class Program26{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of an array:-");
		int len=scan.nextInt();
		System.out.println("Please enter "+len+" values :-");
		int[] num=new int[len];
		
		for(int i=0;i<len;i++){
			num[i]=scan.nextInt();			
		}
		System.out.println("Please enter the number you want to search in this array :-");
		int toFind=scan.nextInt();
		int flag=0;
		for(int i=0;i<len;i++){
			if(toFind==num[i]){
				System.out.println("The number "+toFind+" is at index :- "+i);
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("The number "+toFind+" is not find in this array you entered.");
		}
	}
}