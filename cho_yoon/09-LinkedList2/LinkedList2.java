public class LinkedList2{

    private Node head;
    private Node tail;

    public LinkedList2(){
	head = new Node();
	tail = new Node();
	head.setNext(tail);
    }

    public void add(String d){
	Node temp = head;
	while(temp.getNext() != null){
	    temp = temp.getNext();
	}
	temp.setNext(new Node(d));
    }

    public String toString(){
	if (head.getData() == null)
	    return null;
	String s = "";
	Node temp = head;
	while (temp.getNext() != null){
	    s = s + temp.getData() + ", ";
	    temp = temp.getNext();

    public void add(String s){
	Node n = head;
	while(n.getNext() != tail){
	    n = n.getNext();
	}
	Node next = new Node(s);
	next.setNext(n.getNext());
	n.setNext(next);
    }

    public void add(int i, String s){
	Node temp = head;
	Node n = new Node(s);

	for(int x = 0; x < i;x++){
	    temp = temp.getNext();

	while (i > 0){
	    temp = temp.getNext();
	    i--;
	    if (temp == tail){
		i=0;
	    }

	}
	n.setNext(temp.getNext());
	temp.setNext(n);
	return;
    }

    public String toString(){
	String s = "";
	Node temp = head.getNext();
	while (temp.getNext() != tail){
	    s = s + temp.getData() + ", ";
	    temp = temp.getNext();
	}
	s = s + temp.getData();
	return s;
    }                                                   

    public String get(int i){
	Node temp = head;
	while (i > 1){
	    if (temp.getNext() != tail){
		temp = temp.getNext();
		i--;
	    }
	    else
		return null;
	}
	return temp.getData();
    }

    public String set(int i, String s){
	Node temp = head.getNext();
	while (i > 0){
	    temp = temp.getNext();
	    i--;
	    if (temp == tail){
		i=0;
	    }
	}
	String t = temp.getData();
	temp.setData(s);
	return t;
    }

    public String remove(int i){
	Node temp = head;
	while (i > 1){
	    if (temp.getNext() != tail){
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
	Node temp = head;
       	for(int x = 0;x < length();x++){
	    if (temp.getData().equals(s)){
		return x;
	    }
	    else
		temp = temp.getNext();
	}
	return -1;
    }

    public int length(){
	Node temp = head;
	int answer = 0;
	if (head.getData() != null)
	    answer++;
	while (temp.getNext()!= tail){
	    answer++;
	    temp = temp.getNext();
	}
      	return answer;
    }

}
