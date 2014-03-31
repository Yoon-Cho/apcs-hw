//Yoon Cho and Adriel Joseph Mendoza

public class DoubleLL<E>{

    private class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data=d;
	}
	public String toString(){
	    return ""+data;
	}

	public void setData(E d){data=d;}
	public E getData(){return data;}

	public void setNext(Node<E> n){next = n;}
	public Node<E> getNext(){return next;}

	public void setPrev(Node<E> p){prev = p;}
	public Node<E> getPrev(){return prev;}
    }

    private Node<E> current;

    //this code inserts the new node at the beginning of the list

    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if (current==null){
	    current = n;
	    n.setNext(n);
	    n.setPrev(n);
	}
	else{
	    n.setNext(current.getNext());
     	    n.setPrev(current);
	    current.setNext(n);
	    current = current.getNext();
	}
    }

    public E getCurrent(){
	return current.getData();
    }

    public void forward(){
	if (current.getNext() != null)
	    current = current.getNext();
    }

    public void back(){
	if (current.getPrev() != null)
	    current = current.getPrev();
    }

    public int length(){
	if (current == null)
	    return 0;
	if (current == current.getNext())
	    return 1;
	int counter = 0;
	Node<E> tmp = current;

	while (tmp.getNext() != current){
	    counter++;
	    tmp = tmp.getNext();
	    if (tmp.getNext() == current){
		counter++;
	    }
	}
	return counter;
    }

    public String toString(){
	if (current == null)
	    return "";
	if (current == current.getNext())
	    return ""+current.toString();
	String s = "";
	Node<E> tmp = current;

	while (tmp.getNext() != current){	    
	    s = s + tmp.toString()+" ";
	    tmp = tmp.getNext();
	    if (tmp.getNext() == current){
		s = s + tmp.toString()+" ";
	    }
	}
	return s;
    }

    public static void main(String[] args){
		DoubleLL<String> L = new DoubleLL<String>();
		System.out.println(L);
		L.insert("hello");
		System.out.println(L);
		L.insert("world");
		System.out.println(L);
		L.insert("three");
		System.out.println(L);
		System.out.println(L.getCurrent());
		L.forward();
		System.out.println(L.getCurrent());
		L.insert("inserted");
		System.out.println(L);

    }
}
