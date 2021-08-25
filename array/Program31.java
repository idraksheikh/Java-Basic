package classFile;
import java.util.Scanner;
public class Program31{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of an array :-");
		int len=scan.nextInt();
		
		System.out.println("Please enter "+len+" values of an array :-");
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=scan.nextInt();			
		}

		int min=arr[1];
		for(int i=0;i<len;i++){
			if(min>=arr[i])
			min=arr[i];
		}
		
		System.out.println("The minimum value : "+min);
	
	}
}