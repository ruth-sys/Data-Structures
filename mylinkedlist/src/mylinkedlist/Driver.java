package mylinkedlist;

public class Driver {

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.InsertAtFront(new Appointment("Fransix", "87bc", "Oil Rub"));
		l.InsertAtFront(new Appointment("Ruht", "34fc", "Hot Rocks"));
		l.InsertAtBack(new Appointment("Sam","65fc","hot massage"));
		l.InsertAtFront(new Appointment("Kenroy", "3bf", "oil Rub"));
		l.Display();
		l.Destroylist();
		System.out.println("After list is destroyed");
		l.Display();
		

	}

}
