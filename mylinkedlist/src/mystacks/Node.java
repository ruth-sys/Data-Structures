package mystacks;

public class Node {
	private Appointment data;
	private Node nextnode;
	
	public Node() {
		data = new Appointment();
		nextnode = null;
	}
	
	public Node(Appointment a, Node n) {
		data = new Appointment(a);
		nextnode = n;
	}
	
	public Node(Appointment a) {
		data = new Appointment(a);
		nextnode = null;
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


}
