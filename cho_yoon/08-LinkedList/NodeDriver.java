public class NodeDriver{

    public static void main(String[] args){
	Node a1 = new Node("Sully");
	Node a2 = new Node("Mike");
	System.out.println(a1);
	System.out.println(a2);
	
	a1.setNext(n2);
	System.out.println(a1.getNext());
	a1.getNext().setNext( new Node("Randall"));

	System.out.println();
	System.out.println(n2.getNext());
	System.out.println(n1.getNext().getNext());

	n1.setNext(n1.getNext().getNext());
	System.out.println("Get rid of a node");
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

    }

}