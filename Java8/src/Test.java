
public class Test {

	public static void main(String[] args) {
		
	//	A a = new C();
		
		A a = () ->System.out.println("Inside main method");
		a.myMethod();
		
	}

}
