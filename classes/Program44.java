package classFile;
import java.util.Scanner;
class Square{
 	private int side;
 	public void setSide(int side){	
		this.side=side;
	}
	public int getSide(){
		return this.side;
	}
 	public int getArea(){
 		return (this.side*this.side);
 	}
 	public int getPerimeter(){
 		return (4*this.side);
 	}
}
public class Program44{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the side of the square.\t");
		int side=scan.nextInt();
		Square squ1=new Square();
		squ1.setSide(side);
		System.out.println("The Area of the square is : "+squ1.getArea());
		System.out.println("The Perimeter of the square is : "+squ1.getPerimeter());
	}
}
