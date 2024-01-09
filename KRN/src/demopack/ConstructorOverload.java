package demopack;

public class ConstructorOverload {

	public static void main(String[] args) {
	  System.out.println("This is Begining");
	  Nine n1=new Nine();
	  Nine n2=new Nine(10, 20);
	  Nine n3=new Nine(20, 30, 40);
	  n3.bangalore();

	}

}

class Nine {
	Nine (){
		System.out.println("This is Nine");
	}
	
	Nine(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	Nine(int a, int b, int c){
		int d=a+b+c;
		System.out.println(d);
	}
	
	public void bangalore() {
		System.out.println("This is Bangalore");
	}
	
}