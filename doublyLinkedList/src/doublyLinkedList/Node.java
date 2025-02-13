package doublyLinkedList;

public class Node <E>{
	private E item;
	public Node<E> next;
	public Node<E> prev;
	public int number;
	

	Node(Node<E>prev , E item , Node<E> next , int number ){
		this.item = item;
		this.next = next;
		this.prev = prev;
		this.number = number;
		//ronaldo is
	}
}
