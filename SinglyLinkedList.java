package first;

public class SinglyLinkedList {
private Node head;

public SinglyLinkedList() {
	this.head=null;
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}
public boolean insertAtBeg(String v) {
	Node nn=new Node(v);
	if(nn==null) {
		return false;
	}
	if(head!=null)
		nn.setNext(head);
	head=nn;
	return true;
}
public boolean insertAtLast(String v) {
	Node nn=new Node(v);
	if(nn==null) {
		return false;
		
	}
	if(head==null) {
		head=nn;
		return true;
	}
	Node temp=head;
	while(temp.getNext()!=null) 
		temp=temp.getNext();
	temp.setNext(nn);
	return true;
}
public boolean insertAtPos(String v, int p) {
	if(head==null) {
		return false;
	}
	if(p<=0) {
		System.out.println("please enter last position");
		return false;
	}
	if(p==1) 
		insertAtBeg(v);
	return true;
	
	
}
public void display() {
	Node temp=head;
    while(temp!=null) {
    	System.out.print(temp.getData()+" ");
    	temp=temp.getNext();
    }
    System.out.println();
}

}
