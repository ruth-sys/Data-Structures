package week11_trees;

public class Node {
	private Person data;
	private Node leftnode;
	private Node rightnode;
	
	public Node() {
		data = new Person();
		leftnode = null;
		rightnode = null;
		
	}
	
	public Node(Person p) {
		data = p;
		leftnode = null;
		rightnode = null;
	}
	
	public Node(int pa, String n) {
		data = new Person(pa, n);
		leftnode = null;
		rightnode = null;
	}
	
	public void setdata(Person p) {
		data = p;
	}
	
	public Person getdata() {
		return data;
	}

	public void setleftnode(Node ln) {
		leftnode = ln;
	}
	
	public Node getleftnode() {
		return leftnode;
	}
	
	public void setrightnode(Node rn) {
		rightnode = rn;
	}
	
	public Node getrightnode() {
		return rightnode;
	}
}
