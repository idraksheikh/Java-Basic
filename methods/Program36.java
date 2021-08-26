package classFile;


public class Program36{
	public static void pattern2(){
		for(int i=4;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		
		pattern2();
	}
}