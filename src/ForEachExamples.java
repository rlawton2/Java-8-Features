import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachExamples {

	public static void main(String[] args) {
		final List<Integer>  list = Arrays.asList(3, 2, 6, 1, 4);
		// Shallow copy examples
		// Copy 1
		List<List<Integer>> list2 = Collections.nCopies(1, list);
		// Copy 2
		List<Integer> list3 = Arrays.asList(new Integer[list.size()]);
		Collections.copy(list3, list);
		// Deep copy
		List <Integer> list4 = new ArrayList<>();
		for(Integer num: list) {
			list4.add(num);
		}
		Collections.sort(list4);
		// For each examples
		// Java 5 - 7
		for(int number: list) {
			ForEachExamples.print(number);
		}
		
		// Java 8 Lambda
		list.forEach(number -> ForEachExamples.print(number));
		
		// Java 8 Method Reference
		list4.forEach(ForEachExamples::print);
		// Standard output
		list.forEach(System.out::print);  
	}
	
	public static void print(final int number) {
		System.out.println("Number: " + number);
	}

}


