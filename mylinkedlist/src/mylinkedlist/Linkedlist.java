package mylinkedlist;

public class Linkedlist {
	private Node Head;
	
	public Linkedlist() {
		Head = null;
	}
	
	public void setHead(Node h) {
		Head = h;
	}
	
	public Node getHead() {
		return Head;
	}
	
	public void Createlist() {
		Head = null;
	}
	
	public void InsertAtFront(Appointment a) {
		Node temp = new Node(a);
		if (temp != null) {
			temp.setData(a);
			temp.setnextnode(null);
			if(Head == null) {
				Head = temp;
			}
			else {
				temp.setnextnode(Head);
				Head = temp;
			}
		}
		else 
			System.out.println("error memory full");
		
	}
	
	public void InsertAtBack(Appointment a) {
		Node temp = new Node(a);
		if (temp != null) {
			temp.setData(a);
			temp.setnextnode(null);
			if (Head == null) {
				Head = temp;
			}
			else {
				Node next = Head;
				while(next.getnextnode()!= null ) {
					next = next.getnextnode();
				}
				next.setnextnode(temp);
			}
		}
		else {
			System.out.println("list full");
		}
		
	}
	
	public void InsertAtMid(Appointment a)
    { 
		Node temp = new Node(a);
		temp.setData(a);
		temp.setnextnode(null);
        if(temp == null) { 
            Head = temp;
        }else {  
            temp.setnextnode(Head);
            Head = temp;
   
            int count = 0;
           // Node next = new Node();
            while (temp != null) {  
            	count++;
                temp = temp.getnextnode();
                
            } 
   
            int mid = count / 2;  
  
            while (count < mid) { 
            	count++;
                temp = temp.getnextnode();
                
            }
   
            //temp.setNextnode(next); 
           
        } 
    } 
	
	public void Destroylist() {
		Node temp = new Node();
		while(Head != null) {
			temp = Head;
			Head = Head.getnextnode();
			temp = null;//dealloctae temp
		}
	}
	
	public void Display() {
		Node temp = Head;
		if (Head == null) {
			System.out.println("list empty");
		}
		else {
			while(temp!= null) {
				System.out.println(temp.getData());
				temp = temp.getnextnode();
			}
		}
	}
	
	/*public boolean Searchlist(String n) {
		Node temp = new Node();
		while(temp!= null) {
			if(temp.getData().getName() = n) {
				return true;
			}
			temp= temp.getnextnode;
		}
		 return false;
		
	}*/

}
