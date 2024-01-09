package demopack;

public class DemoHello {

	public static void main(String[] args) {
		System.out.println ("This is Begining");
		one o1=new one();
		o1.bangalore();
		o1.Chennai();
		o1.Mumbai();
		
		two t1=new two();
		t1.Kerala();
	}

}

class one {
	public void bangalore() {
		System.out.println("This is Bangalore");
	}
	
	public void Chennai() {
	System.out.println("This is Chennai");
		
	}
	
	public void Mumbai() {
		System.out.println("This is Mumbai");
	}
		
}

class two {
	public void Kerala() {
	System.out.println("This is Kerala");	
	}
}
