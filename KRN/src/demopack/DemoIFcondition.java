package demopack;

public class DemoIFcondition {

	public static void main(String[] args) {
		
		String actual="ABCD";
		String expected="ABCD123";
		
		boolean status=actual.equals(expected);
		
		if (!status) {
			System.out.println("This is Sucess");
		}

		else {
			
			System.out.println("This is Failure");
			
		}
		
	}

}
