package week11_trees;

public class Driver {

	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.InsertNode(new Person(26, "Ruth"));
		tree.InsertNode(new Person(13, "Kenroy"));
		tree.InsertNode(new Person(32, "Smauel"));
		
		System.out.println("Pre Order Traversal");
		tree.PreOrderTraversal(tree.getrootNode());
		System.out.println("");

	}

}
