package JavaCodingInterview;

import java.util.*;
import java.util.stream.*;

public class CountDuplicate2 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 3, 3, 3, 4, 3 };
		Map<Object, Long> occurrences = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		occurrences.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() + " occurs " + e.getValue() + " times."));
	}
}
