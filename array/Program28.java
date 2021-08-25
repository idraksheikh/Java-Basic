package classFile;
import java.util.Scanner;
public class Program28{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
	
		
		int[][] a=new int[2][3];
		int[][] b=new int[2][3];
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("Please enter ("+i+" , "+j+") value of A matrix :-\t");		
				a[i][j]=scan.nextInt();			
			}			
			System.out.println("");		
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("Please enter ("+i+" , "+j+") value of B matrix :-\t");		
				b[i][j]=scan.nextInt();			
			}			
			System.out.println("");		
		}
		int[][] sum=new int[2][3];
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
			
				sum[i][j]=a[i][j]+b[i][j];			
			}			
		}
		System.out.println("The sum of matrices are :-");	
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("\t"+sum[i][j]+"\t");	
			}			
			System.out.println("");	
		}
	
	}
}