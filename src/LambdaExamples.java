
public class LambdaExamples {

	public static void main(String[] args) {
		/*
		 * Lambda operator ->
		 * interface var = parameters -> method body
		 * NumOperation add = double operation(a,b) { return a+b; };
		 */
		NumOperation add = (a,b) -> a+b;
		NumOperation subtract = (a,b) -> a-b;
		NumOperation divide = (a,b) -> a/b;
		NumOperation multiply = (a,b) -> a*b;
		
		
		System.out.println(multiply.operation(1.50, 2.75));
		System.out.println(multiply.operation(5.4, 3.5));

	}

}

@FunctionalInterface
interface NumOperation {
	double operation(double a, double b);
}