
//Junhong Liu   03/04/2023

package LinkedList;

public class LinkedList {
	private Node first;
	private int size;

	public void add(int item) {

		Node oldFirst = first;

		first = new Node();

		first.data = item;

		first.next = oldFirst;

		size++;
	}

	private class Node {

		private int data;

		private Node next;

	}

	public String toString() {

		String str = " ";

		for (Node currentNode = first; currentNode != null; currentNode = currentNode.next) {
			str = str + currentNode.data + " ";
		}

		return str;
	}

	public boolean search(int key) {
		Node currentNode = first;

		boolean found = false;

		while (currentNode != null && !found) {
			if (currentNode.data == key)
				found = true;
			else
				currentNode = currentNode.next;
		}

		return found;
	}

	public int size() {

		return size;
	}

	public int removeFirst() {

		int temp = first.data;

		if (first != null)

			first = first.next;

		size--;

		return temp;
	}

	public void insertAfter(int key, int item) {
		boolean found = false;

		Node newNode = first;
		Node newItem = new Node();
		newItem.data = item;

		while (newNode != null && !found) // look for key, then add item after the key
		{
			if (newNode.data == key) {
				found = true;
				newItem.next = newNode.next;
				newNode.next = newItem;
				size++;
			} else
				newNode = newNode.next;
		}
		if (found == false) // if can`t find the key, then add item

			add(item);
	}

	public void removeAfter(int key) {
		boolean found = false;

		Node newNode = first;

		while (newNode != null && !found) {
			if (newNode.data == key) {
				found = true;

				if (newNode.next == null)
					System.out.println("last item in the list");
				else {
					newNode.next = newNode.next.next;
					size--;
				}
			} else
				newNode = newNode.next;
		}

	}

	public void removeDuplicate(int item) {
		add(item);

		Node preNode = first;
		Node curNode = first.next;
		boolean found = false;

		while (curNode != null && !found) {
			if (curNode.data == item) {
				found = true;

				preNode.next = curNode.next;

				size--;
			} else {
				preNode = preNode.next;
				curNode = curNode.next; // move current and pre node to the next
			}

		}
	}
}
