//Name: Ruth Elliott;
//ID: 1700229;

public class Queue {
	private Node front;
	private Node rear;
	
	public Queue(){
		front = null;
		rear = null;
	}
	
	@SuppressWarnings("unused")
	public void Enqueue(Teachers t){
		Node temp = new Node();
		if(temp != null){
			if(front == null){
				front = temp;
				rear = temp;
			}
			else{
				rear.setnextnode(temp);
				temp.setprevnode(rear);
				rear = temp;
			}
		}
		else{
			System.out.println("Queue is full, can not add another node.");
		}
	}
	
	public Teachers Dequeue(){
		if(front != null){
			Teachers Ttemp = new Teachers();
			Ttemp = front.getdata();
			Node temp = front;
			temp.getdata();
			front = front.getnextnode();
			temp = null;
			return Ttemp;
						
		}
		else {
			System.out.println("Error can not Dequeue");
			return null;
		}
	}
	
	public int QueueCount(){
		int count = 0;
		Node temp = front;
		while(temp!= null){
			count++;
			temp.getnextnode();
			
		}
		return count;
	}
	
	public Teachers QueueRear(){
		Node temp = rear;
		if (temp != null){
			return rear.getdata();
		}
		else{
			System.out.println("could not return rear");
			return null;
		}
	}

}
