public class BST{

    private Node root;

    public BST(){
	root = null;
    }

    /*
1. get a pointer to the parent of the node we want to delete(one recursion?)
2. 3 cases
a.The node to delete is a leaf - set the parent's left or right pointer for appropriate to null
b.The node to delete has one child - set the parent's left or right pointer(or appropriate) to the node's non-null pointer
a and b can be contained
c.The node to delete has two children - 
- find the largest value on the left subtree 
- make a copy of that value
- pretend you have a tree and keep changing until you have a max of two children
- replace the node to delete



     */



    public Node insert(Node n, int x){
	if (n = null)
	    n = new Node(x);
	else if (n.getData() > x)
	    insert(n.getLeft(), x);
	else 
	    insert(n.getRight(), x);
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
	if (c == null || c.getData() == x)
	    return c;
	else if (x < node.getData())
	    return search2(c.getLeft(), x);
	else
	    return search2(c.getRight(), x);
    }

    public static void main(String[] args){
	
    }

}
