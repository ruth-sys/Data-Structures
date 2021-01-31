package queues;

public class Queue {
	private Node front;
	private Node rear;
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public void enqueue(Appointment a) {
		Node temp = new Node(a);
		if (temp!= null) {
			temp.setData(a);
			temp.setnextnode(null);
			temp.setprevnode(null);
			if(front == null) {
				rear = temp;
				front = temp;
			}
			else {
				rear.setnextnode(temp);
				temp.setprevnode(rear);
				rear = temp;
			}
		}
		else {
			System.out.println("queue full");
		}
	}

}