package list;

import java.util.*;
public class ArrayList_Framework {

	public static void main(String[] args) {
	int y=40;
		//Collection<Integer> a = new ArrayList<>();
		//List<Integer> a = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		a.add(40);
		a.add(50);
		a.add(60);
		
		++y;
		System.out.println("Print directly : ");
		System.out.println("Contents of ArrayList = " +a );
		++y;
		System.out.println("add 70 at 0 th position: "); 
		a.add(0,70); // add at index 0 

		System.out.println("Contents of ArrayList = " +a );
		System.out.println("Size of list : " +a.size());
		
		System.out.println("remove element of pos 1: ");
		a.remove(1);//20
		System.out.println("Contents of ArrayList = " +a );
		
		System.out.println("replace element of 1st index : ");
		a.set(0, 100);
		System.out.println("Contents of ArrayList = " +a );
		System.out.println("Size of list : " +a.size());
		
		Collections.sort(a);
		System.out.println("Sorted ArrayList = " +a );
		
		int x= a.get(1);
		System.out.println("element at index 1  = " +x);
		//a.clear();
		
	
		// print directly
		System.out.println("1.Print directly : ");
		System.out.println("Contents of ArrayList = " +a );
		
		//By iterator
				System.out.println("2.Print by iterator : ");
				Iterator j = a.iterator() ;
				while(j.hasNext())
				{
					System.out.println(j.next());
				}
				
		//By list iterator
		
		System.out.println("3.By list iterator");
		ListIterator<Integer> i = a.listIterator() ;
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		 
		
		
		//Print by foreach loop
		System.out.println("4.Print by foreach loop");
		
		for(int k :a)
		{
			System.out.println(k);
		}
		
		
		
	}

}
