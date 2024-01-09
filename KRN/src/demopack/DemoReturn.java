package demopack;

public class DemoReturn {

	public static void main(String[] args) {
	System.out.println("THis is Begining");	
	
	five f1=new five();
	int c=f1.add(20, 30);
	System.out.println(c);
	
	int d=f1.add(10, 10);
	System.out.println(d);
	
	int e=f1.add(40, 40);
	System.out.println(e);
	
	int k=f1.multiplication(2, 10);
	System.out.println(k);
	
	f1.bangalore();
	
	}

}


class five{
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int multiplication(int a, int b) {
		int c=a*b;
		return c;
	}
	
	public void bangalore() {
	System.out.println("This is Bangalore");
	
	}
	
}