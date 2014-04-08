public class Driver{

    public static void main(String[] args){
	MyStack n = new MyStack();
	n.push("one");
	n.push("two");
	n.push("three");
	n.push("four");
	n.push("five");

	System.out.println(n.pop());
	System.out.println(n.pop());
	System.out.println(n.pop());

	System.out.println(n.size());
	System.out.println(n.toString());
    }

}
