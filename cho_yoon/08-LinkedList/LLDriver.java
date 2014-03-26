import java.util.*;

public class LLDriver implements Iterator{

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
