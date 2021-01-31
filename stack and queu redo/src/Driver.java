
public class Driver {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.Enqueue(new Order(1234, "Books on Food", 12.9f));
		q.Enqueue(new Order(1544, "Air Freshner", 55.90f));
		q.Enqueue(new Order(9843,"Soft Cottons", 8.34f));
		q.display();
		
		System.out.println("Number of items in Queue: " +q.countQueue());
		
		System.out.println("Removing items from queue");
		
		q.Dequeue();
		q.Dequeue();
		q.display();
		System.out.println("Number of elements in Queue after dequeue: " +q.countQueue());
		

	}

}
