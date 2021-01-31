
public class Stack {
	
	private Node top;
	
	public Stack() {
		top = null;
	}
	
	public Order gettop() {
		if (top == null) {
			return  null;
		}
		else {
			return top.getdata(); 
		}
	}
	
	public boolean isEmpty(){
		return top==null;
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
	
	public void push (Order order) {
		if(isFull()) {
			System.out.println("Stack is full ");
		}
		else {
			Node ordertag = new Node(order, null);
			if (isEmpty()) {
				top = ordertag;
				
			}
			else {
				ordertag.setNode(top);
				top = ordertag;
			}
		}
	}
	
	public Order pop(){
		if(isEmpty()){
			System.out.println("Stack is empty, nothing to pop");
		}
		
		else{
			Order data = top.getdata();
			Node temp = top;
			top = top.getNode();
			temp = null; //delete temp
			return data;
		}
		return null;
	}
	
	public void display(){
		Node temp = top;
		while(temp != null){
			System.out.println (temp.getdata());
			temp = temp.getNode();
		}
	}
	
	public void destroy(){
		while(pop() !=null);
	}
	
	
}