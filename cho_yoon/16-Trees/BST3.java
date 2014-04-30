public class BST{

    private node root;

    public node search(int x){
	node c = root;
	while(c!=null && c.getData()!=x){
	    if (c.getData()<x)
		c = c.getRight();
	    else
		c = c.getLeft();
	}
	return c;
    }

}