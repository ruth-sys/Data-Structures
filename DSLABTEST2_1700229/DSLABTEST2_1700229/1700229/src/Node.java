//Name: Ruth Elliott;
//ID: 1700229;

public class Node {
	private Teachers data;
	private Node nextnode;
	private Node prevnode;
	
	public Node(){
		data = new Teachers();
		nextnode = null;
		prevnode = null;
		
	}
	
	public Node(Teachers t){
		data = new Teachers();
		nextnode = null;
		prevnode = null;
		
	}
	
	public void setdata(Teachers t){
		data = t;
		
	}
	
	public void setnextnode(Node nn){
		nextnode = nn;
	}
	
	public void setprevnode(Node pn){
		prevnode = pn;
	}
	
	public Teachers getdata(){
		return data;
		
	}
	
	public Node getnextnode(){
		return nextnode ;
	}
	
	public Node getprevnode(){
		return prevnode;
	}
	
	

}
