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

	public void pushData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public static void main(String[] args) {

		main list = new main();

		list.pushData(70);
		list.pushData(30);
		list.pushData(56);
		list.printList();

	}

}