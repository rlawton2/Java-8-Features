import java.util.function.Consumer;

public class ExistingFunctionInterface {
	/*
	 * Consumer<T> is one of many existing functional interfaces
	 * in the Java library
	 * accept (T t) is a method in the Consumer interface
	 */
	public static void main(String[] args) {
	Consumer<String> c = s -> System.out.println(s); // Lambda
	c.accept("Lamda");
	//OR
	Consumer<String> c2 = System.out::println;		 // Method reference
	c2.accept("Method Reference");
	
	Person p = new Person("Dean", "Franks", 42);
	Consumer<Person> p1 = System.out::println;
	p1.accept(p);
	}
}

class Person {
	private String fName;
	private String lName;
	private int age;
	
	Person (String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
	
}
