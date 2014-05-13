public class BinaryHeap{

    private Node root;

    public BinaryHeap(){
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


    public void Sort(){}

    public String transverse(){
	Node n = root;
	if (n == null){
	    return;
	}else{
	    System.out.print(n.getData()+", ");
	}
    }

    public String traverse(Node c){

    }

    //1. the root will always be greater than its children
    //2. the tree is as full as possible from left to right
    //3. does not use "left" and "right"


    //remove
    //return root
    //take the lowest node, bring it to the highest and replace
    //keep swapping the lowest value number with a higher number and take it back to the bottom
    //restore heap property

    //insert
    //just use a loop



}