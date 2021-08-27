package classFile;
import java.util.Scanner;
import java.lang.Math;
class Circle{
 	private int radius;
 	public void setRadius(int radius){	
		this.radius=radius;
	}
	public int getRadius(){
		return this.radius;
	}
 	public float getArea(){
 		float area=(float)Math.PI*this.radius*this.radius;
 		return area;
 	}
 	public float getPerimeter(){
 		float per=(float)Math.PI*2*this.radius;
 		return per;
 	}
}
public class Program46{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the radius of the Circle.\t");
		int radius=scan.nextInt();
		Circle squ1=new Circle();
		squ1.setRadius(radius);
		System.out.println("The Area of the Circle is : "+squ1.getArea());
		System.out.println("The Perimeter of the Circle is : "+squ1.getPerimeter());
	}
}
