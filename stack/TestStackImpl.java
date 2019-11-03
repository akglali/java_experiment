package stack;

public class TestStackImpl {

	public static void main(String[] args) {

		/*
		 Stack stack= new StackImpl();
		
		stack.push("AKGÖL");
		stack.push("AKGÖ");
		stack.push("AKG");
		stack.push("AK");
		stack.push("A");
		
		while (!stack.empty()) {
			
			System.out.println(stack.pop());
			
		}
		*/
		Stack stack1= new StackArrayImpl();
		
		stack1.push("AKGÖL");
		stack1.push("AKGÖ");
		stack1.push("AKG");
		stack1.push("AK");
		stack1.push("A");
		
		while (!stack1.empty()) {
		System.out.println(stack1.pop());
		
		}
		
	

		
		
	}

}
