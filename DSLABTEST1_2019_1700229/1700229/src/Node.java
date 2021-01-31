/*Name : Ruth Elliott
 *Id : 1700229
 */


public class Node {
	private Canteen Data;
	private Node NextNode;
	
	public Node(){
		Data = new Canteen();
		NextNode = null;
	}
	
	public Node(Canteen data, Node nn){
		Data = data;
		NextNode = nn;
		
	}
	
	public Node(Canteen c) {
		// TODO Auto-generated constructor stub
	}

	public void setCanteen(Canteen data){
		Data = data;
	}
	
	public void setNextNode(Node nn){
		NextNode = nn;
	}
	
	public Canteen getCanteen(){
		return Data;
	}
	
	public Node getNextNode(){
		return NextNode;
	}

}
