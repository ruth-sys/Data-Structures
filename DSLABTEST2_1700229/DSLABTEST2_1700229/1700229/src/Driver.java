//Name: Ruth Elliott;
//ID: 1700229;


import java.util.Scanner;


public class Driver {

	
	public static void main(String[] args) {
		Queue q = new Queue();
		int entry = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amout of node");
		entry = in.nextInt();
		
		for(int i = 0; i < entry; i++){
			System.out.println("Enter Teacher's Name ");
			String name = in.next();
			System.out.println("Enter Classroom Number ");
			String classes = in.next();
			System.out.println("Enter Number of Student ");
			int num = in.nextInt();
			
			q.Enqueue(new Teachers(name, classes, num));
			//in.close();
			
		}
		
		in.close();

		System.out.println("Number of Items in Queue: " +q.QueueCount());
		System.out.println("Removing Queue");
		q.Dequeue();
	
		
		System.out.println("Data at rear: " +q.QueueRear());
		
		
	}

}
