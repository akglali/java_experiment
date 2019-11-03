package stack;

import java.util.ArrayList;

public class StackArrayImpl implements Stack {
	
	
	
	ArrayList<Object> items = new ArrayList<Object>();

	
	public void push(Object obj) {
		
		items.add(obj);
	}

	public Object pop() {
		
		return items.remove(items.size()-1);
		
	}

	
	public boolean empty() {

		return items.size()==0 ;
	}

}
