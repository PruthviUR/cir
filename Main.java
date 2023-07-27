package first;


public class Main {

	public static void main(String[] args) {
		SinglyLinkedList l=new SinglyLinkedList();
		l.insertAtLast("Rahul");
		l.insertAtLast("Ram");
		l.insertAtBeg("Pruthvi");
		l.insertAtPos("Rudra",1);
		l.display();
		l.insertAtPos("Rahul",3);
		l.display();
		
	}

}
