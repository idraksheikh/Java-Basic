package classFile;
import java.util.Scanner;
class Employee{
	private int salary;
	private String name;
	public void setSalary(int salary){	
		this.salary=salary;
	}
	public void setName(String name){	
		this.name=name;
	}
	public int getSalary(){
		return this.salary;
	}
	public String getName(){
		return this.name;
	}
}
public class Program42{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your good name.");
		String name=scan.nextLine();
		System.out.println("Please Enter your Salary.");
		int salary=scan.nextInt();
		Employee emp1=new Employee();
		emp1.setSalary(salary);
		emp1.setName(name);
		System.out.println("The information of Employee is as follows : ");
		System.out.println("Name :\t"+emp1.getName());
		System.out.println("Salary :\t"+emp1.getSalary());

	}
}
