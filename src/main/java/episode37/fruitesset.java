package episode37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class fruitesset {

	public static void main(String[] args) {
		
		// output not in order and no duplicates
		
		/*Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Mango");
		set.add("Apple");
		set.add("Pine");
		
		for (String string : set) {
			System.out.println(string);*/
		
		// output in Ascending order and no duplicates allowed
		
		/*Set<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Mango");
		set.add("Apple");
		set.add("Pine");
		for (String string : set) {
			System.out.println(string);*/
		
		// output as like you entered
		
		/*Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Mango");
		set.add("Apple");
		set.add("Pine");
		for (String string : set) {
			System.out.println(string);*/
		
		// get() function not working in set because each time the output value will be changing.
		// So we can use get in set through constructor
			
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Apple");
		list.add("Mango");
		list.add("Pine");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
			
		}
		
		
		
		
		
		/*
		 * List<String> Mylist = new ArrayList<String>(set); for (String string :
		 * Mylist) { System.out.println(string);
		 * 
		 * } System.out.println("----------"); String index = Mylist.get(0);
		 * System.out.println(index);
		 */
		
		
		
		}

	}


