package demopack1;

public class DemoInheritance {

	public static void main(String[] args) {
		
	System.out.println("This is Bangalore");
Five F1=new Five();
F1.chennai();
F1.pune();
F1.mumbai();
Five.bangalore();
	
	}
}

class Five extends six {
	
	public static void bangalore() {
		System.out.println("This is Bangalore");
	}
		public void chennai() {
			System.out.println("This is Chennai");
		}
		
	}

class six {
	
	public void mumbai() {
		System.out.println("This is Mumbai");
		
	}
	
	public void pune() {
		System.out.println("This is Pune");
		
	}
	
}