public class Node {
	private Node nextnode;
	private Node prevnode;
	private Order data;
	
	public Node(){
		data = new Order();
		nextnode = null;
		prevnode = null;
		
	}
	
	
	public Node(Order d){
		data = d;
		nextnode = null;
		prevnode = null;
		
	}
	
	public Node(int id, String desc, float pr){
		data = new Order(id, desc, pr);
		nextnode = null;
		prevnode = null;
		
	}
	
	
	public void setnextnode(Node nn){
		nextnode = nn;
		
	}
	
	public void setprevnode(Node pn) {
		prevnode = pn;
	}
	
	public void setdata( Order d){
		data = d;
	}
	
	public Node getnextnode(){
		return nextnode;
	}
	
	public Node getprevnode() {
		return prevnode;
	}
	
	public Order getdata(){
		return data;
	}


	
	
	


	
}
