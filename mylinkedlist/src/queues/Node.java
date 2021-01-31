package queues;

public class Node {
	private Appointment data;
	private Node nextnode;
	private Node prevnode;
	
	public Node() {
		data = new Appointment();
		nextnode = null;
		prevnode = null;
	}
	
	public Node(Appointment a, Node n, Node p) {
		data = new Appointment(a);
		nextnode = n;
		prevnode =p;
	}
	
	public Node(Appointment a) {
		data = new Appointment(a);
		nextnode = null;
		prevnode = null;
	}
	
	public void setData(Appointment a) {
		data = new Appointment (a);
	}
	
	public Appointment getData() {
		return data;
	}
	
	public void setnextnode(Node n) {
		nextnode = n;
	}
	
	public Node getnextnode() {
		return nextnode;
	}
	
	public void setprevnode(Node p) {
		prevnode = p;
	}
	
	public Node getprevnode() {
		return prevnode;
	}


}
