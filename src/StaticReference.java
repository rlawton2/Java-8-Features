import java.util.function.BiFunction;
/*
 * The java library interface BiFunction<T,U,R> is used here.
 *   T = first arg  U = second arg  R = result
 * The method apply(T t, U u) belongs to the BiFuction interface
 */
public class StaticReference {

	public static void main(String[] args) {
		// Can call Addition method addition directly because it is static
		BiFunction<Integer, Integer, Integer> sum = Calulate::addition;
		System.out.println("The sum of 5 + 4 is " + sum.apply(5, 4));
	}
}

// Class with a static method named addition
class Calulate {
	
	public static int addition(int a, int b) {
		return (a + b);
	}
}
