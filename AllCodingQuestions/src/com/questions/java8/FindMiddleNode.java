package Second;

public class FindMiddleNode {

	public static void main(String[] args) {
		FindMiddleNode f = new FindMiddleNode();
		f.addNode(12);
		f.addNode(22);
		f.addNode(32);
		f.addNode(42);
		f.addNode(52);
		f.addNode(62);
		f.addNode(72);
		f.printMe();
		f.middleNode();
	}
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
	Node tail = null;
	public void addNode(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node;
			tail = new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
		}
	}
	public void printMe() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public void middleNode() {
		Node slowPointer = head;
		Node fastPointer = head;
		while(fastPointer !=null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		System.out.println("Middle Node is "+slowPointer.data);
	}
}
