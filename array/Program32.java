package classFile;
import java.util.Scanner;
public class Program32{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of an array :-");
		int len=scan.nextInt();
		
		System.out.println("Please enter "+len+" values of an array :-");
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=scan.nextInt();			
		}

		int flag=0;
		for(int i=0;i<len-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.println("The given array is not sorted.");
				flag=1;
				break;
			}	
		}
		if(flag==0){
			System.out.println("The given array is sorted. ");
		}	
	}
}