public class BST{

    private Node root;

    public BST(){
	root = null;
    }

    public Node insert(Node n, int x){
	if (n == null)
	    n = new Node(x);
	else if (n.getData() > x)
	    insert(n.getLeft(), x);
	else 
	    insert(n.getRight(), x);
	return n;
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
	else if (x < c.getData())
	    return search2(c.left, x);
	else
	    return search2(c.right, x);
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

    /*
      in order transversal - left,process,right
      pre order transversal - process,left,right
      post order transversal - left,right,process
     */

    public void traverse(Node c){
	if (c == null){
	    return;
	}
	else{
	    traverse(c.getLeft());
	    System.out.print(c.getData()+", ");
	    traverse(c.getRight());
	}
    }


    public static void main(String[] args){
	BST m = new BST();
	m.insert(m.root,52);
	m.insert(m.root,12);
	m.insert(m.root,84);
	m.insert(m.root,298);
	m.insert(m.root,376);
	m.insert(m.root,14);
	m.insert(m.root,47);
	m.insert(m.root,27);
	m.insert(m.root,5);
	m.insert(m.root,15);
	m.traverse(m.root);
    }

}
