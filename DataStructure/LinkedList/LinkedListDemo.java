//Junhong Liu

package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		
		LinkedList myList = new LinkedList();
		
		myList.add(11);
		myList.add(12);
		myList.add(13);
		
		
			
		System.out.println(myList.search(12));
		
		System.out.println(myList.search(15));
		
		System.out.println(myList);
		
		int top = myList.removeFirst();
		
		System.out.println(myList);
	}

}
