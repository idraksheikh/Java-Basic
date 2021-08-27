package classFile;

class CellPhone{
	
	public void vibrate(){	
		System.out.println("Vibrating...");
	}
	public void ring(){	
		System.out.println("Ringing...");
	}
}
public class Program43{
	public static void main(String[] args) {
		
		
		CellPhone cell1=new CellPhone();
		cell1.vibrate();
		cell1.ring();
		
	}
}
