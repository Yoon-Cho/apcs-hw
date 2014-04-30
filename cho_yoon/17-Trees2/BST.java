public class BST{

    private Node root;

    public BST(){
	root = null;
    }

    public Node insert(Node n, int x){
	if (root = null)
	    root = new Node(x);
	else if (root.getData() > x)
	    insert(root.getLeft(), x);
	else 
	    insert(root.getRight(), x);
    }

    public Node Search(int x){
	Node n = root;
	while (n != null){
	    if (n.getData() == x)
		return n;
	    else if (x < n.getData())
		n = n.getLeft();
	    else
		n = n.getRight();
	}
	return null;
    }

    public Node search2(Node c, int x){
	if (c = null || c.getData() == x)
	    return c;
	else if (x < c.getData())
	    return search2(c.left, x);
	else
	    return search2(c.right, x);
    }

    public Node delete(Node c, int x){
	if (x < c.getData()){
	    c.left = delete(c.left, x);
	}
	else if (x > c.getData()){
	    c.right = delete(c.right, x);
	}
	else{
	    if (c.left == null)
		return c.left;
	    if (c.right == null)
		return c.right;
	}
	return c;
    }

    public static void main(String[] args){
	
    }

}
