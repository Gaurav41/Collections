package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(106);
		a.add(304);
		a.add(502);
		a.add(601);
		a.add(205);
		a.add(403);
		
		System.out.println("Print directly : ");
		System.out.println("Contents of ArrayList = " +a );
		Collections.sort(a);
		System.out.println("Sorted ArrayList = " +a );
		
		Comparator<Integer> com = new ComparatorImpl() {
			
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Collections.sort(a,com);
		
		System.out.println("Sorted ArrayList by comparator = " +a );
		
		//LAMBDA EXPRESSION
		Comparator<Integer> com1 =(o1,o2) -> {
			if((o1%10) > (o2%10))
			{
				return 1;
			}
			return -1;
		};
		Collections.sort(a,com1);
		System.out.println("Sorted ArrayList by comparator(LambdaExpression = " +a );
		
		//
		
		

	}

}
