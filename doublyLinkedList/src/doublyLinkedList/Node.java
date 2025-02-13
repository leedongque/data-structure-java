package doublyLinkedList;

public class Node <E>{
	private E item;
	public Node<E> next;
	public Node<E> prev;

	Node(Node<E>prev , E item , Node<E> next ){
		this.item = item;
		this.next = next;
		this.prev = prev;
	}
}
