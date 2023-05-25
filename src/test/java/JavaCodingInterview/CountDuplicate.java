package JavaCodingInterview;


	
	import java.util.HashMap;

	public class CountDuplicate {
	    public static void main(String[] args) {
	        int[] array = {1, 1, 2,2,2, 3, 3, 3, 4, 3};
	        HashMap<Integer, Integer> countMap = new HashMap<>();

	        // Count the occurrences of each element in the array
	        for (int element : array) {
	            if (countMap.containsKey(element)) {
	                int count = countMap.get(element);
	                countMap.put(element, count + 1);
	            } else {
	                countMap.put(element, 1);
	            }
	        }

	        // Print the elements that occur more than once
	        for (int element : countMap.keySet()) {
	            int count = countMap.get(element);
	            if (count > 1) {
	                System.out.println(element + " occurs " + count + " times.");
	            }
	        }
	    }
	}



