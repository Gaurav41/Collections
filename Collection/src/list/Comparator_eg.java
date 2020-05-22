package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Comparator_eg {

	public static void main(String[] args) {
		List<Names> list = new LinkedList<>();
		list.add(new Names("a"));
		list.add(new Names("bc"));
		list.add(new Names("defghi"));
		list.add(new Names("xyz"));

		Collections.sort(list);
		Comparator_eg c = new Comparator_eg();
		c.printlist(list);
	}

	void printlist(List<Names> list) {
		ListIterator<Names> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println("Element : " + it.next());
		}
	}
}

class Names implements Comparable<Names> {
	String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Names obj) {
		if (this.name.length() == obj.name.length()) {
			return 0;
		} else if (this.name.length() > obj.name.length()) {
				return 1; // -1 for reverse
		} else {
			return -1; // 1
		}
	}

}

/*
 * Element : bc 
 * Element : xyz 
 * Element : defghi
 * 
 * 
 * //Reverse 
 * Element : xyz 
 * Element : bc 
 * Element : a
 * 
 */