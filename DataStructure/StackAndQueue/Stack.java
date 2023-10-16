//Junhong Liu
package Stack;

public class Stack<Item> implements Stackable<Item> 
{

	private Node first;
	private int size;
	
	// push item to first
	@Override
	public void push(Item item) 
	{
		
		Node oldFirst = first;

		first = new Node();

		first.data = item;

		first.next = oldFirst;
		
		size++;
	}
	//pop the first item
	@Override
	public Item pop() 
	{
				
		Item temp = first.data;
		
			first = first.next;
			size --;
		
		return temp;
	}

	@Override
	public int size() 
	{
		
		return size;
	}

	@Override
	public boolean isEmpty() 
	{
		
		return first == null; //size == 0
	}
	private class Node 
	{
		private Item data;
		private Node next;
		
	}
}
