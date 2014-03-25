public class MyLinkedList<E> implements Iterator{

    private Node<E> head;

    public MyLinkedList(){
	head = null;
    }

    public Iterator<E> iterator(){
    }

    public void add(E d){
	Node<E> tmp = new Node<E>(d);
	tmp.setNext(head);
	head = tmp;
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

    public void add(int i, String s){
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

    public String get(int i){
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

    public String set(int i, String s){
	Node<E> temp = head;
	while (i > 0){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
	String t = temp.getData();
	temp.setData(s);
	return t;
    }

    public String remove(int i){
	Node<E> temp = head;
	while (i > 1){
	    if (temp.getNext() != null){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
	String t = temp.getNext().getData();
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

}
