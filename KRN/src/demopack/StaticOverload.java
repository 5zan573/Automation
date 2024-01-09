package demopack;

public class StaticOverload {

	public static void main(String[] args) {
    System.out.println("This is Begining");		
        Eight.add(10, 20);
        Eight.add(10, 20, 30);
        Eight.add(20, 40, "This is Addition");
        
        Eight E1=new Eight();
        E1.bangalore();
    
    
	}

}

class Eight {
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void add (int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
		
	}
	
	public static void add (int a, int b, String msg) {
		int c=a+b;
		System.out.println(c+msg);
	}
	
	public void bangalore() {
		System.out.println("This is Bangalore");
	}
	
	
}