public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	Stack stack = new Stack();
	Queue queue = new Queue();
	
		Order order = new Order(1654, "Book on Java", 67.34f);
		System.out.println ("Adding tag" +order);
		stack.push(order);
		queue.enqueue(order);
	
	System.out.println("--- Items in stack");
	stack.display();
	System.out.println ("---Items in queue");
	queue.display();
	
	System.out.println ("--removing Items");
	for(int i=1; i<7; i++){
		Order tag = stack.pop();
		System.out.println ("Popped from stack: "+tag);
		tag = queue.dequeue();
		System.out.println ("popped from stack" +tag);
		tag= queue.dequeue();
		System.out.println("Dequeue from queue"+tag);
		}
	}

}