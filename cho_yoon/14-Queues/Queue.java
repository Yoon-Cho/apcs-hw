public class Queue{

    private Node head, tail;
    private int size;

    public Queue(){
	head = null;
	tail = null;
	size = 0;
    }

    public void enqueue(String s){
	tail = new Node(s);
	if (tail == null){
	    tail = n;
	    head = n;
	}else{
	    tail.setNext(n);
	    size++;
	}
    }

    public String dequeue(){
	String s;
	if (head==null){
	    return "";
	}else{
	    s = head.getData();
	    head = head.getNext();
	    size--;
	}
    }

    public String front(){
	if (head ==null)

    }

    public String toString(){
	String s = "Head --> ";
	if (head==null){
	    s = s + "null --> ";
	}
	Node tmp = head;
	while (tmp != null){
	    s = s + tmp.getData()+"--> ";
	    tmp = tmp.getNext();
	}
	
    }

}