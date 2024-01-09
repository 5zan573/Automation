package demopack;

public class DemoConstructor {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Six s1=new Six();
		s1.bangalore();

	}

}

class Six{
	Six(){
		System.out.println("This is Six");
	}
	
	public void bangalore() {
		System.out.println("This is Bangalore");
	}
	
}

//Constructor name is same name as class name
//Constructor will be called by default when an object is created
//Constructor will not have any return type