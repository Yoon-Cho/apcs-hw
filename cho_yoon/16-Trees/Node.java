public class Node{

    private int data;
    private Node left, right;

    public Node(){
	data = null;
	left = null;
	right = null;
    }

    public Node(int i){
	data = i;
	left = null;
	right = null;
    }

    public void setData(String d){
	data = d;
    }

    public int getData(){
	return data;
    }

    public void setLeft(Node n){
	left = n;
    }

    public Node getLeft(){
	return left;
    }

    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
	return right;
    }

    public String toString(){
	return ""+data;
    }
}
