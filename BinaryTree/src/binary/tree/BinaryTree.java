package binary.tree;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree() {
		root = new Node(41);
		root.setParent(null);
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void insertNode(Node root, Node n) {
		if(n.getValue() <  root.getValue()) {
			if(root.getLeft() != null) {
				insertNode(root.getLeft(), n);
			} else {
				root.setLeft(n);
				n.setParent(root);
			}
		} else {
			if(root.getRight() != null) {
				insertNode(root.getRight(), n);
			} else {
				root.setRight(n);
				n.setParent(root);
			}
		}
	}
	
	public void run() {
		insertNode(root, new Node(30));
		insertNode(root, new Node(47));
		insertNode(root, new Node(28));
		insertNode(root, new Node(38));
		insertNode(root, new Node(35));
		insertNode(root, new Node(39));
		printInsertedNodes(root);
	}
	//10-5-2-20
	public void printInsertedNodes(Node n) {
		 //pre-post-inorder
		if(n == null) {
			return;
		} else {
			if(n.getParent() != null) {
				System.out.println("Value: " + n.getValue() + " parent: " + n.getParent().getValue() + " rank: " + getNodeRank(n));
			} else {
				System.out.println("Value: " + n.getValue() + " rank: " + getNodeRank(n));
			}
			printInsertedNodes(n.getLeft());
			printInsertedNodes(n.getRight());
		}
	}
	
	public void search(Node n, int value) {
		if(value == n.getValue()) {
			System.out.println("Node has been found: " + n.getValue() + " parent: " + n.getParent().getValue());
		} else if(value < n.getValue()) {
			search(n.getLeft(), value);
		} else {
			search(n.getRight(), value);
		}
	}
	
	public int getNumberOfNodes(Node n) {
		if(n == null) {
			return 0;
		} else {
			return 1 + getNumberOfNodes(n.getLeft()) + getNumberOfNodes(n.getRight());
		}
	}
	
	public int getHeight(Node n) {
		if(n == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(n.getLeft()), getHeight(n.getRight()));
		}
	}
	
	public int getNodeRank(Node n) {
		int r = getNumberOfNodes(n.getLeft()) + 1;
		Node q = n;
		while(q != root) {
			if(q == q.getParent().getRight()) {
				r += getNumberOfNodes(q.getParent().getLeft()) + 1;
			}
			q = q.getParent();
		}
		return r;
	}
	
	public int getNextNode(Node n) {
		if(n.getRight() != null) {
			n = n.getRight();
			while(n.getLeft() != null) {
				n = n.getLeft();
			}
			return n.getValue();
		} else {
			while(n.getParent() != null) {
				if(n.getParent().getLeft() == n) {
					return n.getParent().getValue();
				}
				n = n.getParent();
			}
			return 0;
		}
	}
	
	public int getPreviousNode(Node n) {
		if(n.getLeft() != null) {
			n = n.getLeft();
			while(n.getRight() != null) {
				n = n.getRight();
			}
			return n.getValue();
		} else {
			while(n.getParent() != null) {
				if(n.getParent().getRight() == n) {
					return n.getParent().getValue();
				}
				n = n.getParent();
			}
			return 0;
		}
	}
}
