public class Driver{

    public static void main(String[] args){

	LinkedList2 L = new LinkedList2();

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
	System.out.println(L.find("Seven") + " found Seven?");
	L.add(1,"Jake");
<<<<<<< HEAD
=======
	L.set(5,"FifthE");
>>>>>>> ca4b7a8c8cef41edb2733566b94043c9fa8a9a37

	System.out.println(L);
    }
}
