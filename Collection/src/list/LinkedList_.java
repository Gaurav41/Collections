package list;

import java.util.LinkedList;

public class LinkedList_ {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<>();
		li.add("INDIA");
		li.add("SHRILANKA");
		li.add("CHINA");
		li.add("RASSHIYA");
		li.add("EGYPT");
		
		System.out.println(li);
		// add at given index
		System.out.println("add ITALY AT INDEX 5" );
		li.add(5, "ITALY");
		System.out.println(li);
		 
		// add first or last
		li.addFirst("KOREA");
		li.addLast("PAk");
		System.out.println(li);
		
		//remove
		li.remove(); // it remove first element by default or removeFirst()
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		//remove(index)
		//li.remove(2);
		System.out.println("Remove element at index 2 : "+li.remove(2));
		System.out.println(li);
		
		li.remove("EGYPT");
		System.out.println(li);
		
		//li.clear();
		//System.out.println(li);

		//get,getFisrt,getLast
		
		System.out.println("get 0th element : " +li.get(0));
		
		//set(index,value)-> REPLACE
		li.set(3, "abc");
		System.out.println(li);
		
		/*li.set(10, "abc");    //ERROR
		System.out.println(li);
		*/


		
	}

}
