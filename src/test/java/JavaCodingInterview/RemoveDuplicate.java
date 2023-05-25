package JavaCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicate.removeDuplicate();

	}

	public static void removeDuplicate() {
		List<Object> ListOfvalue = new ArrayList<Object>();
		ListOfvalue.add(1);
		ListOfvalue.add(1);
		ListOfvalue.add("Java");
		ListOfvalue.add(3);
		ListOfvalue.add(2);
		ListOfvalue.add(4);
		ListOfvalue.add("Java");
		ListOfvalue.add("C+");

		List<Object> removedup = ListOfvalue.stream().distinct().collect(Collectors.toList());
		System.out.println(removedup);

	}

}
