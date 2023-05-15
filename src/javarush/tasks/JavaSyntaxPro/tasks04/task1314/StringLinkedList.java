package javarush.tasks.JavaSyntaxPro.tasks04.task1314;


public class StringLinkedList {
	private Node first = new Node();
	private Node last = new Node();


	public void add(String value) {
		if (first.next == null && last.prev == null) {
			Node node = new Node();
			node.value = value;

			node.next = last;
			first.next = node;
			node.prev = first;
			last.prev = node;

		} else {

			Node node = new Node();
			node.value = value;

			last.prev.next = node;
			node.prev = last.prev;
			last.prev = node;

		}
	}
	public String get(int index) {

		Node n = first.next;

		if (n == null || index < 0){
			return null;
		}

		for (int i = 0; i <= index; i++){
			if(n.next == null){
				return null;
			}
			n = n.next;
		}
		return n.value;
	}

	public static class Node {
		private Node prev;
		private String value;
		private Node next;
	}
}
