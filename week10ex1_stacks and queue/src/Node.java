public class Node {
	private Node nextnode;
	private Order data;
	
	public Node(){
		nextnode = null;
		data = new Order();
	}
	
	
	public Node(Order d, Node nn){
		data = d;
		nextnode = nn;
		
	}
	
	public void setNode(Node nn){
		nextnode = nn;
		
	}
	public void setdata( Order d){
		data = d;
	}
	
	public Node getNode(){
		return nextnode;
	}
	
	public Order getdata(){
		return data;
	}


	@Override
	public String toString() {
		return "Node [nextnode=" + nextnode + ", data=" + data + "]";
	}
}



