public class Driver{

    public static void main(String[] args){

	LinkedList2 L = new LinkedList2("Eight");

	L.add("Seven");
	L.add("Six");
	L.add("Five");
	L.add("Four");
	L.add("Three");  
	L.add("Two");
	L.add("One");
	L.add("Zero");
	System.out.println(L);
	L.remove(3);
	System.out.println(L.get(4) + " should be 4");
	System.out.println("length is: " + L.length());
	System.out.println(L.find("Seven") + " found 7?");
	L.add(1,"Jake");

	System.out.println(L);
    }
}
