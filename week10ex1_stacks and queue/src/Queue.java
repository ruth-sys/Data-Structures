
public class Queue {
	private Node front;
	
	public Queue() {
		front = null;
	}
	
	public Order getfront() {
		if (front == null) {
			return null;
		}
		else {
			return front.getdata();
		}
	}
	
	public boolean isEmpty(){
		return front==null;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull(){
		Node temp = new Node();
		 if(temp==null){
			 return true;
		 }
		 else{
			 temp=null;
			 return false;
		 }
	}
	
	public void enqueue(Order order){
		if (isFull()){
			System.out.println("queue is full, unble to add");
		}
		
		else{
			Node next = new Node(order, null);
			if(isEmpty()){
				front = next;
			}
			else{
				Node temp = front;
				while(temp.getNode() !=null){
					temp = temp.getNode();
				}
				temp.setNode(next);
			}
		}
	}
	
	public Order dequeue(){
		if(isFull()){
			System.out.println("queue is Empty"); 
		}
		else{
			Order data = front.getdata();
			Node temp = front;
			front = front.getNode();
			temp=null;
			return data;
		}
		return null;
	}
	public Order pop(){
		if(isEmpty()){
			System.out.println("Stack is empty, nothing to pop");
		}
		
		else{
			Order data = front.getdata();
			Node temp = front;
			front = front.getNode();
			temp = null; //delete temp
			return data;
		}
		return null;
	}
	public void display(){
		Node temp = front;
		while(temp != null){
			System.out.println (temp.getdata());
			temp = temp.getNode();
		}
	}
	
	public void destroy(){
		while(dequeue() !=null);
	}

}
