package episode36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Pine");
		for (String string : list) {
			System.out.println(string);
			
		}
		System.out.println("-----------");
		boolean empty = list.isEmpty();
		System.out.println(empty);
		System.out.println("-----------");
		String firstvalue = list.get(0);
		System.out.println(firstvalue);
		System.out.println("-------------");
		
		boolean contains = list.contains("Pine");
		System.out.println(contains);
		
		list.remove("Apple");
		System.out.println("---------------");
		
		for (String string : list) {
			System.out.println(string);
			
		}
		Integer total = list.size();
		System.out.println("Total Size:  " +total);
		System.out.println("--------------");
		list.clear();
		Integer total1 = list.size();
		System.out.println("Total Size:  " +total1);
	}

}
