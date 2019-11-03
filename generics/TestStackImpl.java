package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStackImpl {

	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		
		lst.add(5);
		lst.add(7);
		
		List<String> lstStr= new LinkedList<>();
		
		lstStr.add("A");
		lstStr.add("B");
		
		List<Object> lstObj = new ArrayList<>();
		
		lstObj.addAll(lstObj);
		lstObj.addAll(lst);
		
		Stack<Object> stackObj= new StackImpl<>();
		
		stackObj.push(5);
		
		


		Stack<String> stack= new StackImpl<>();
		
		stack.push("AKGÖL");
		stack.push("AKGÖ");
		stack.push("AKG");
		stack.push("AK");
		stack.push("A");
		
		stackObj.addAll(stack);
		
		System.out.println(stackObj.toList());
		
		System.out.println(stack.toList() );
		
		Stack<String> stack2= new StackImpl<>();
		
		stack.push("AL");
		stack.push("ALİ");
		
		stack.addAll(stack2);
		
		System.out.println(stack.toList());
		
		while (!stack.empty()) {
			String str = stack.pop();
		System.out.println(str);
		
		}
		
		Stack<Integer> stackInt = new StackArrayImpl<Integer>();
		stackInt.push(5);
		int a = stackInt.pop();
		int c;
		c=8;
		Integer b=c;
		
	
		
	

		
		
	}

}
