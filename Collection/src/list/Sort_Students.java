package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Students {

	
	public static void main(String[] args) {
		
		List<Students> li = new ArrayList<>();	
		li.add(new Students(1,50));
		li.add(new Students(2,30));
		li.add(new Students(2,80));
		li.add(new Students(3,90));
		li.add(new Students(4,100));
		li.add(new Students(5,70));
		li.add(new Students(6,80));
	
		System.out.println("arraylist = "+ li);
		System.out.println("sort in decending order:");
		
		Collections.sort(li,(s1,s2)-> { return s1.marks>s2.marks?-1: 1;} );
		
		for(Students s : li)
		{
			System.out.println(s);
		}



	}

}


class Students
{
	int roll_no;
	int marks;
	public Students(int roll_no, int marks) {
		this.roll_no = roll_no;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [roll_no=" + roll_no + ", marks=" + marks + "]";
	}
	
	
	
}
