/*Name : Ruth Elliott
 *Id : 1700229
 */


public class Linkedlist {
	private Node Head;
	
	public Linkedlist(){
		Head  = null;
	}
	
	public void CreateList(){
		Head = null;
	}
	
	
	
	@SuppressWarnings("unused")
	public void InsertAtFront(Canteen c){
		Node temp = new Node(c);
		if(temp!=null){
			temp.setCanteen(c);
			temp.setNextNode(null);
			if (Head == null){
				temp = Head;
			}else {
				temp.setNextNode(Head);
				Head = temp;
			}
		}
		else{
			System.out.println("List is full cannot add anymore");
		}
		
	}
	
	@SuppressWarnings("unused")
	public float SumOfPrices(){
		Node temp  = new Node();
		float addPrice = 0.0f;
		if(temp == null){
			temp = Head;
		}else{
			
			while (temp!= null){
				addPrice = addPrice+ temp.getCanteen().getPrice();
				temp = temp.getNextNode();
			}
			
		}
		
		return addPrice;
	}
	
	@SuppressWarnings("unused")
	public void DisplayList(){
		Node temp = new Node();
		if(temp == null){
			temp = Head;
		}else{
			while(temp.getCanteen()!= null){
				System.out.println(temp.getCanteen());
				temp = temp.getNextNode();
			}
			
		
		}
	}

}
