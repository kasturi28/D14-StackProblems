package practiseproblem;

public class main {

	Node head;
	Node tail;

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

	public void addData(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void appendNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	// public void appendData(int data) {

	// Node newNode = new Node(data);
	// if (head == null) {
	// head = newNode;
	// tail = newNode;
	// } else {
	// newNode.next = head;
	// head = newNode;
	// }
	// }

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
	}

	// public void pushData(int data) {
	// Node newNode = new Node(data);
	// if (head == null) {
	// head = newNode;
	// tail = newNode;
	// } else {
	// newNode.next = head;
	// head = newNode;
	// }
	// }

	public static void main(String[] args) {

		main list = new main();

		list.addData(56);
		list.appendNode(30);
		list.appendNode(70);
		list.printList();

	}

}