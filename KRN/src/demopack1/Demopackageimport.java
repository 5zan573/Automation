package demopack1;

import demopack2.Three;

	class one {
		
		public void bangalore () {
			System.out.println("This is Bangalore");
		}
		
			public void chennai() {
				System.out.println("This is Chennai");
			}
			
			
		}
	
	public class Demopackageimport {

		
		public static void main(String[] args) {
			
			System.out.println("This is Begining");
			
			one o1=new one();
			o1.bangalore();
			o1.chennai();
			
			Two t1=new Two();
			t1.delhi();
		    t1.Noid();           
		    
		    Three t2=new Three();
		    t2.mumbai();
		    t2.Pune();
		}
	}



