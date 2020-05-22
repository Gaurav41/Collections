package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class SortByComparable {

	

public static void main(String[] args) {
		
        List<Student> a = new ArrayList<>();	
		a.add(new Student(1,50));
		a.add(new Student(2,30));
		a.add(new Student(2,80));
		a.add(new Student(3,90));
		a.add(new Student(4,100));
		a.add(new Student(5,70));
		a.add(new Student(6,80));
	
		System.out.println("arraylist = "+ a);
		System.out.println("sort in decending order:");
		
		//Collections.sort(a,(s1,s2)-> { return s1.marks>s2.marks?-1: 1;} );
		
		//Collections.sort(a);
		
		for(Student s : a)
		{
			System.out.println(s);
		}



	}

}


class Student implements Comparable<Students>
{
	int roll_no;
	int marks;
	public Student(int roll_no, int marks) {
		this.roll_no = roll_no;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Students s) {
		
		return this.marks>s.marks?-1: this.marks < s.marks?1:0;
		
		
	}
	
	@Override
	public String toString() {
		return "Students [roll_no=" + roll_no + ", marks=" + marks + "]";
	}
	
	
	
}

