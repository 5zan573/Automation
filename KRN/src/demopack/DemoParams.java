package demopack;

public class DemoParams {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		
		Three t3=new Three();
		t3.add(10, 30);
        t3.add(30, 50);		
        t3.city("Bangalore");
	}

}

class Three {
	public void add (int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void city (String cityname) {
		System.out.println(cityname);
	}
	
	
}