package week11_trees;

public class BST {
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public void setrootNode(Node r) {
		root = r;
	}
	
	public Node getrootNode() {
		return root ;
	}
	
	public void InsertNode(Person p) {
		Node n = new Node(p);
		Node temp;
		if (n != null) {
			if (root == null) {
				root = n;
			}
			else
			{
				temp = root;
				while(true) {
					if (n.getdata() < temp.getdata()) {
						if (temp.getleftnode()==null) {
							temp.setleftnode(n);
							break;
						}
						else {
							temp = temp.getleftnode();
						}
					}
					else {
						if (temp.getrightnode() == null) {
							temp.setrightnode(n);
							break;
						}
						else {
							temp = temp.getrightnode();
						}
					}
				}
			}
		}
		else {
			System.out.println("Memory full could not add new node");
		}
	}
	
	public void PreOrderTraversal(Node r) {
		if (r!= null) {
			System.out.println(r.getdata()+"");
			PreOrderTraversal(r.getleftnode());
			PreOrderTraversal(r.getrightnode());
		}
	}

}
