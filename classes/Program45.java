package classFile;
import java.util.Scanner;
class Rectangle{
 	private int length;
 	private int breadth;
 	public void setLength(int length){	
		this.length=length;
	}
	public int getLength(){
		return this.length;
	}
	public void setBreadth(int breadth){	
		this.breadth=breadth;
	}
	public int getBreadth(){
		return this.breadth;
	}
 	public int getArea(){
 		return (this.length*this.breadth);
 	}
 	public int getPerimeter(){
 		return (2*(this.length+this.breadth));
 	}
}
public class Program45{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the length of the Rectangle.\t");
		int length=scan.nextInt();
		System.out.print("Please enter the breadth of the Rectangle.\t");
		int breadth=scan.nextInt();
		Rectangle squ1=new Rectangle();
		squ1.setLength(length);
		squ1.setBreadth(breadth);
		System.out.println("The Area of the Rectangle is : "+squ1.getArea());
		System.out.println("The Perimeter of the Rectangle is : "+squ1.getPerimeter());
	}
}
