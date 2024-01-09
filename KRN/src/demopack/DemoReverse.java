package demopack;

public class DemoReverse {

	public static void main(String[] args) {
		
		String actual="Selenium Training in Bangalore";
		
		int len=actual.length();
		
		char arr[]=actual.toCharArray();
		
		
		for (int i=len-1; i >=0; i--) {
		System.out.print(arr[i]);
		
	}
}
	
}