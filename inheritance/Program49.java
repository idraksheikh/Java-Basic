package classFile;
import java.util.Scanner;
class Cylinder1 extends Circle{
	private int height;
	public void setHeight(int height){	
		this.height=height;
	}

	public int getHeight(){
		return this.height;
	}

	public void setRadius1(int radius){	
		super.setRadius(radius);
	}
	public int getRadius1(){
		return super.getRadius();
	}
	public float getArea(){
 		float area=(float)Math.PI*2*super.getRadius()*this.height;;
 		return area;
 	}
 	public float getVolume(){
 		float vol=(float)Math.PI*super.getRadius()*super.getRadius()*this.height;
 		return vol;
 	}
}
public class Program49{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the radius of the Cylinder1.\t");
		int radius=scan.nextInt();
		System.out.print("Please enter the height of the Cylinder1.\t");
		int height=scan.nextInt();
		Cylinder1 cyl2=new Cylinder1();
		cyl2.setRadius1(radius);
		cyl2.setHeight(height);
		System.out.println("The Area of the Cylinder1 is : "+cyl2.getArea());
		System.out.println("The Volume of the Cylinder1 is : "+cyl2.getVolume());
	}
}