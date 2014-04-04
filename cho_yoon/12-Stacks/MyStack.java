public class MyStack{

    private Node top;

    //contructor 1
    public MyStack(){
	top = null;
    }

    //push 2
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
    }

    //pop
    public String pop(){
	String ret = tmp.getData();
	top = top.getNext();
	return ret;
    }

    //peek

    public boolean isEmpty(){
	return (top==null);
    }

    //toString 3
    public String toString(){
	String s = "";
	Node tmp = top;
	while(tmp!=null){
	s = s + tmp.getData()+" ";
	tmp = tmp.getNext();
	}
	return s.substring(-,s.length()-2);
    }
    


}