//Junhong Liu

package Stack;

public class Queue<Item> implements QueueInterface<Item> {
	private Node first;
	private Node last;
	private int size;

	private class Node {

		Item data;
		Node next;
	}

	@Override
	public Item dequeue() {

		Item temp = first.data;
		first = first.next;
		size--;

		if (size == 0)
			last = null;

		return temp;
	}

	@Override
	public void enqueue(Item item) {

		Node oldlast = last;

		last = new Node();

		last.data = item;

		if (isEmpty())
			first = last;
		else
			oldlast.next = last;

		size++;
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

}
