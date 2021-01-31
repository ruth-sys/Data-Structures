package week5ex1_linkedlist;



public class Linkedlist {
	private Node Head;
	
	public Linkedlist() {
		Head = null;
	}
	
	public void createList() {
		Head = null;
	}
	
	public Node getHead() {
		return Head;
	}
	
	public void setHead(Node h) {
		Head = h;
	}
	
	public  boolean isEmpty() {
		if (Head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	public boolean isfull() {
		Node temp =new Node();
		if(temp == null) {
			return true;
		}else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	public void InsertAfront(Student s) {
		Node temp = new Node(s);
		if (temp!= null){
			temp.setStudent(s);
			temp.setNextnode(null);
			if (Head == null) {
				Head = temp;
			}
			else {
				temp.setNextnode(Head);
				Head = temp;
			}
		}
		else{
			System.out.println("Memory full cannot add any more");
		}
	}
		
	public void AddtoBack (Student s ){
		if(isfull()) {
			System.out.println("list is full");
		}else {
			Node nextnode = new Node(s);
			if(isEmpty()) {
				Head = nextnode;
			}else {
				Node temp = Head;
				while(temp.getNextnode()!= null) {
					temp = temp.getNextnode();
				}
				temp.setNextnode(nextnode);
			}
		}
	}
	
	public void InsertAtMid(Student s)
    { 
		Node temp = new Node(s);
		temp.setStudent(s);
		temp.setNextnode(null);
        if(isEmpty()) { 
            Head = temp;
        }else {  
            temp.setNextnode(Head);
            Head = temp;
   
            int count = 0;
           // Node next = new Node();
            while (temp != null) {  
            	count++;
                temp = temp.getNextnode();
                
            } 
   
            int mid = count / 2;  
  
            while (count < mid) { 
            	count++;
                temp = temp.getNextnode();
                
            }
   
            //temp.setNextnode(next); 
           
        } 
    } 
  
 	
	public void display() {
		Node temp = Head;
		if (Head == null) {
			System.out.println("The list is empty");
		}
		else {
			while(temp!= null) {
				System.out.println(temp.getStudent());
				temp = temp.getNextnode();
			}
		}
	}
	
	public int count() {
		Node temp = Head;
		int count =0;
		while(temp!= null) {
			temp = temp.getNextnode();
			count++;
			
		}
		return count;
		
	}
}
	
	
	
