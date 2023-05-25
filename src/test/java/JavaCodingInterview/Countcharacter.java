package JavaCodingInterview;

import java.util.HashMap;

public class Countcharacter {
	
	public static void main(String[] args) {
		String str="United State of America";
		str=str.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c : str.toCharArray()) {
			
		
		if( map.containsKey(c)){
			map.put(c, map.get(c) + 1);
		}
		else {
			map.put(c, 1);
		}
	}
		System.out.println("Number of Character : "+map);
		
	}

}
