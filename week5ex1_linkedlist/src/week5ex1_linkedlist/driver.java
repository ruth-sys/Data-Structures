package week5ex1_linkedlist;




public class driver {

	public static void main(String[] args) {
		
		Linkedlist linked = new Linkedlist();
		linked.createList();
		linked.InsertAfront(new Student(7432, "Thesa","Sammuel", 2.98f));
		linked.AddtoBack(new Student (17642,"Wiliam", "Frouk", 3.56f));
		linked.InsertAfront(new Student (35721, "Ruth", "Elliott", 3.00f));
		linked.InsertAtMid(new Student (72193, "Yiadyu", "Uyefr", 2.00f));
		linked.InsertAfront(new Student (7293, "UYVT", "JCFD", 4.00f));
		linked.AddtoBack(new Student (6834, "tally", "kings", 3.54f));
		linked.InsertAfront(new Student (65234, "julu", "kiye", 3.70f));
		linked.display();
		System.out.println("the number of nodes in list: "+linked.count());
		
		
		
		
		
		
		
	}

}
