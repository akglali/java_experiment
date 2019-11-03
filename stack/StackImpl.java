package stack;

public class StackImpl implements Stack {
	
	private StackItem top;

	public void push(Object obj) {
		
		StackItem item = new StackItem(obj);
		
		item.setNext(top);
		
		top = item ;
		
		
	}

	public Object pop() {
		StackItem item = top;
		
		top = top.getNext();
		return item.getObj();
	}

	public boolean empty() {
		
		return top == null;
	}

}
