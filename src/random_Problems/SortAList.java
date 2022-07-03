package random_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(55);
		al.add(3);
		al.add(23);
		al.add(53);
		al.add(66);
		al.add(22);
		al.add(33);
		al.add(11);
		al.add(99);
		al.add(67);
		
		System.out.println("Before sort "+al);
		Collections.sort(al);
		System.out.println("After sort in ascending order "+al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("After sort in descending order "+al);
		System.out.println("#####################################################");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("BMW");
		al2.add("Maruti");
		al2.add("Volvo");
		al2.add("Merc");
		al2.add("Toyota");
		al2.add("Honda");
		al2.add("Hyundai");
		al2.add("Ertiga");
		
		System.out.println("Before sort "+al2);
		Collections.sort(al2);
		System.out.println("After sort in ascending order "+al2);
		
		Collections.sort(al2, Collections.reverseOrder());
		System.out.println("After sort in descending order "+al2);
	}

}
