package classFile;
import java.util.Scanner;
public class Program13{
	public static void main(String[] args) {
		//make object of Scanner to take input from users
		Scanner scan=new Scanner(System.in);
		int dobSpCount=0;
		int strt=0;
		//take input form users
		System.out.println("Please enter any string :-");
		String  str=scan.nextLine();
		
		
		for(int i=strt;i<str.length();i++){
			if(str.indexOf("  ",strt)!=-1){
				dobSpCount++;
				strt=str.indexOf("  ",strt)+1;
			}else{
				break;
			}
		}
		strt=0;
		int tripSpCount=0;
		for(int i=strt;i<str.length();i++){
			if(str.indexOf("   ",strt)!=-1){
				tripSpCount++;
				strt=str.indexOf("   ",strt)+2;
			}else{
				break;
			}
		}
		dobSpCount-=2*tripSpCount;
		System.out.println("Double spaces in string are "+dobSpCount);
		System.out.println("Triple spaces in string are "+tripSpCount);
	}
}