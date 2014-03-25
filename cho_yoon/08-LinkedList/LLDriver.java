public class LLDriver{

    public static void main(String[] args){

	MyLinkedList L = new MyLinkedList();

	L.add("Eight");
	L.add("Seven");
	L.add("Six");
	L.add("Five");
	L.add("Four");
	L.add("Three");  
	L.add("Two");
	L.add("One");
	L.add("Zero");
	
	Iterator<MyLinkedList> iter = L.Iterator();
    }
}
