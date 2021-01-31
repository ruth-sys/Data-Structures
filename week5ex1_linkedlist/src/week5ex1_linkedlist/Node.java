package week5ex1_linkedlist;


public class Node  {
	private Student Data;
	protected Node Nextnode;
	
	public Node(){
		Data = new Student();
		Nextnode = null;
		
	}
	
	public Node (Student s, Node n) {
		Data = new Student(s);
		Nextnode =n;
	}
	public Node(Student s) {
		Data = new Student(s);
		Nextnode = null;
	}
	
	public Student getStudent() {
		return Data;
	}
	
	public Node getNextnode() {
		return Nextnode;
	}
	
	public void setStudent(Student s) {
		Data = new Student(s);
	}
	
	public void setNextnode(Node n) {
		Nextnode =n;
	}
	
	

}
