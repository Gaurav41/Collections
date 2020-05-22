package list;

import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.push(100);
	s.push(50);
	s.push(50);
	s.push(90);
	System.out.println(s);
	
	//pop
	System.out.println("Popped element is : "+ s.pop());
	
	System.out.println(s);
	
	//Peek
	System.out.println("topmost element is : "+s.peek());
	
	//serch
	
	System.out.println("Is 50 is present in stack : "+ s.search(50));   // 1 yes
	System.out.println("Is 80 is present in stack : "+ s.search(80));   // -1 no
	}

}
