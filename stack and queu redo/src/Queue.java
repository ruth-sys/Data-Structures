import java.util.Deque;

public class Queue {
	private Node front;
	private Node rear;
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public void Enqueue(Order d) {
		Node temp = new Node();
		if (temp != null) {
			if (front == null) {
				front = temp;
				rear = temp;
			}
			else {
				rear.setnextnode(temp);
				temp.setprevnode(rear);
				rear = temp;
			}
		}
		else 
		{
			System.out.println("Queue is full unable to add new data");
		}
	}
	
	public Order Dequeue() {
		if (front != null) {
			Order order = new Order();
			order = front.getdata();
			Node temp = front;
			front = front.getnextnode();
			temp = null;
			return order;
			
		}
		else
		{
			System.out.println("Error cant get front of queue");
			return null;
		}
	}
	
	public int countQueue() {
		int count = 0;
		Node temp = front;
		while(temp != null) {
			count++;
			temp= temp.getnextnode();
		}
		return count;
		
		
	}
	
	public void display(){
		Node temp = front; 
		while(temp != null){
			System.out.println (temp.getdata());
			temp = temp.getnextnode();
		}
	}

}
