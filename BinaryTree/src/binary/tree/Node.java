package binary.tree;

public class Node {
	private int value;
	private Node left, right;
	private Node parent;
	private int size;
	private int rank;
	
	public Node(int v) {
		this.value = v;
	}
	
	public int getValue() {
		return value;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setLeft(Node l) {
		left = l;
	}
	
	public void setRight(Node r) {
		right = r;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node p) {
		parent = p;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int r) {
		rank = r;
	}
}
