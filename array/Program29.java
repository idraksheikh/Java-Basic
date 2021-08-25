package classFile;
import java.util.Scanner;
public class Program29{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of an array :-");
		int len=scan.nextInt();
		
		System.out.println("Please enter "+len+" values of an array :-");
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=scan.nextInt();			
		}
		System.out.println("The array before reversing :- ");
		for(int i=0;i<len;i++){
			System.out.print(" "+arr[i]+" ");	
		}
		try{
		System.out.println("");
		for(int i=0;i<(len/2);i++){
			int temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(len/2);	
	}
		System.out.println("The array after reversing :- ");
		
		for(int i=0;i<len;i++){
			System.out.print(" "+arr[i]+" ");	
		}
	
	}
}