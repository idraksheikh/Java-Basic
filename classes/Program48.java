package classFile;
import java.util.Scanner;
class Rectangle1{
 	private int length;
 	private int breadth;
 	public  Rectangle1(){	
		this.length=4;
		this.breadth=5;
	}
	public  Rectangle1(int length, int breadth){	
		this.length=length;
		this.breadth=breadth;
	}
	public int getLength(){
		return this.length;
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
public class Program48{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the length of the Rectangle1.\t");
		int length=scan.nextInt();
		System.out.print("Please enter the breadth of the Rectangle1.\t");
		int breadth=scan.nextInt();
		Rectangle1 rec2=new Rectangle1(length, breadth);
		Rectangle1 rec3=new Rectangle1();
		
		System.out.println("The Area of the Rectangle1 is : "+rec2.getArea());
		System.out.println("The Perimeter of the Rectangle1 is : "+rec2.getPerimeter());

		System.out.println("The Rectangle with default dimensions.\t");
		System.out.println("The Area of the Rectangle1 is : "+rec2.getArea());
		System.out.println("The Perimeter of the Rectangle1 is : "+rec2.getPerimeter());
	}
}
