import java.util.*;

public class MyLinkedList<E> implements Iterable<E>{

    private Node<E> head;

    public MyLinkedList(){
	head = null;
    }

    public Iterator<E> iterator(){
	Iterator<E> n =  new LinkedIterator();
	return n;
    }

    public class LinkedIterator implements Iterator{

	private int currentIndex = 0;

	public boolean hasNext(){
	    return currentIndex < length();
	}

	public E next(){
	    currentIndex++;
	    return get(currentIndex-1);
	}

	public void remove(){
	    MyLinkedList<E> x = new MyLinkedList<E>();
	    x.remove(currentIndex);
	}
    }

    public void add(E d){
	Node<E> temp = new Node<E>(d);
	temp.setNext(head);
	head = temp;
    }

    public String toString(){
	if (head.getData() == null)
	    return null;
	String s = "";
	Node<E> temp = head;
	while (temp.getNext() != null){
	    s = s + temp.getData().toString() + ", ";
	    temp = temp.getNext();
	}
	s = s + temp.getData();
	return s;
    }                                                   

    public void add(int i, E s){
	Node<E> temp = head;
	Node<E> n = new Node<E>(s);
	while (i > 1){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return;
	}
	n.setNext(temp.getNext());
	temp.setNext(n);
	return;
    }

    public E get(int i){
	Node<E> temp = head;
	while (i > 1){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
	return temp.getData();
    }

    public E set(int i, E s){
	Node<E> temp = head;
	while (i > 0){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
        E t = temp.getData();
	temp.setData(s);
	return t;
    }

    public E remove(int i){
	Node<E> temp = head;
	while (i > 1){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
	E t = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return t;
    }

    public int find(String s){
	Node<E> temp = head;
       	for(int x = 0;x < length();x++){
	    if (temp.getData() == s){
		x++;
		return x;
	    }
	    else
		temp = temp.getNext();
	}
	return -1;
    }

    public int length(){
	Node<E> temp = head;
	int answer = 0;
	if (head.getData() != null)
	    answer++;
	while (temp.getNext()!= null){
	    answer++;
	    temp = temp.getNext();
	}
	if (temp.getData() != null)
	    answer++;
	return answer;
    }

    public static void main(String[] args){

	MyLinkedList<String> L = new MyLinkedList<String>();

	L.add("Eight");
	L.add("Seven");
	L.add("Six");
	L.add("Five");
	L.add("Four");
	L.add("Three");  
	L.add("Two");
	L.add("One");
	L.add("Zero");

	Iterator m = L.iterator();
	
	while(m.hasNext()){
	    System.out.println(m.next());
	}
    }

}
