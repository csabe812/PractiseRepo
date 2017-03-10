package binary.tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.run();
		System.out.println(bt.getNumberOfNodes(bt.getRoot().getRight()));
		System.out.println("Height: " + bt.getHeight(bt.getRoot()));
		System.out.println("Next: " + bt.getNextNode(bt.getRoot()));
		System.out.println("Prev: " + bt.getPreviousNode(bt.getRoot()));
	}
}
