/*
 * A simple demonstration of how to create a constructor reference
 */
public class ConstructorReference {

	public static void main(String[] args) {
		
		// Method reference to constructor
		Display dis = Hello::new;
		dis.display("Hello from Arizona");

	}

}

// Functional interface
@FunctionalInterface
interface Display {
	
	Hello display(String arg);
}

// Class with constructor
class Hello {
	
	public Hello(String say) {
		System.out.println(say);
	}
}
