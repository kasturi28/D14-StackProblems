package practiseproblem;

public class main {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	/**
	 * 
	 * @param args
	 */

	public void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void printList() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + "---");
			currNode = currNode.next;
		}
		System.out.println("null");

	}

	public static void main (String[] args) {

		main list = new main();

		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.printList();

	}

}