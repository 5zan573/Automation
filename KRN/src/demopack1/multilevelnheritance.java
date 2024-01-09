package demopack1;

public class multilevelnheritance {

	public static void main(String[] args) {
		
		System.out.println("This is Begeining");
five f1=new five();
f1.bangalore();
f1.chennai();
f1.mumbai();
f1.pune();
f1.delhi();

six s1=new six();
s1.mumbai();
s1.pune();
s1.delhi();

seven s2=new seven();
s2.delhi();

		}

}

class five extends six {
	
	public void bangalore() {
		System.out.println("This is Bangalore");
		}
	
	public void chennai() {
		System.out.println("This is Chennai");
	}
	
}

class six extends seven {
	
	public void mumbai () {
		System.out.println("This is Mumbai");
	}
	

	public void pune () {
		System.out.println("This is Pune");
	}
}


class seven {
	
public void delhi() {
	System.out.println("This Delhi");
}
}