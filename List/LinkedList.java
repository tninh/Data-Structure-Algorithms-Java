package List;

public class LinkedList{
	Node head; 
	
	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			//current.next.next.data = data;
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		//Node current = newHead;
		if (head == null) {
			head = newHead;
			return;
		}
		else
		{
			newHead.next = head;
			head = newHead;
		}
	}
	
	public void deleteWithData(int data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
}

class Node {
	Node next = null;
	int data;
	public Node (int d) {
		data = d;
	}
}