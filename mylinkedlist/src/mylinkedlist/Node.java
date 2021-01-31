package mylinkedlist;

public class Node {
	private Appointment Data;
	private Node nextnode;
	
	public Node() {
		Data = new Appointment();
		nextnode = null;
	}
	
	public Node(Appointment a, Node n) {
		Data = new Appointment(a);
		nextnode = n;
	}
	
	public Node(Appointment a) {
		Data = new Appointment(a);
		nextnode = null;
	}
	
	public void setData(Appointment a) {
		Data = new Appointment (a);
	}
	
	public Appointment getData() {
		return Data;
	}
	
	public void setnextnode(Node n) {
		nextnode = n;
	}
	
	public Node getnextnode() {
		return nextnode;
	}

}
