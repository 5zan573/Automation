package demopack;

public class DemoOverload {

	public static void main(String[] args) {
		System.out.println("This is Begining");
	Seven s1=new Seven();
			s1.add(10, 20);
	        s1.add(20, 30, 10);
	        s1.add(20, 20,  "This is Addition");
		s1.bangalore();

	}

}

class Seven{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);	
	}
	
	public void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
		}
	
	public void add(int a, int b, String msg) {
		int c=a+b;
		System.out.println(msg + c);
	}
	
	public void bangalore(){
		System.out.println("This is Bangalore");
	}
	
}
