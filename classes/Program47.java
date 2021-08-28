package classFile;
import java.util.Scanner;
import java.lang.Math;
class Cylinder{
 	private int radius;
 	private int height;
 	public Cylinder(int radius,int height){	
		this.radius=radius;
		this.height=height;
	}
	public int getRadius(){
		return this.radius;
	}
	public int getHeight(){
		return this.height;
	}
 	public float getVolume(){
 		float volume=(float)Math.PI*this.radius*this.radius*this.height;
 		return volume;
 	}
 	public float getArea(){
 		float area=(float)Math.PI*2*this.radius*(this.radius+this.height);
 		return area;
 	}
}
public class Program47{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the radius of the Cylinder.\t");
		int radius=scan.nextInt();
		System.out.print("Please enter the height of the Cylinder.\t");
		int height=scan.nextInt();
		Cylinder cyl1=new Cylinder(radius,height);
		
		System.out.println("The Area of the Cylinder is : "+cyl1.getArea());
		System.out.println("The Volume of the Cylinder is : "+cyl1.getVolume());
	}
}
