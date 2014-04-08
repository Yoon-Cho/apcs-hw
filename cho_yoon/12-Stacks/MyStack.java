public class MyStack{

    private int top;
    private String[] list;

    public MyStack(){
	list = new String[10];
	top = -1;
    }

    public void extend(){
	if (top==list.length-1){
	    String[] tmp = new String[list.length+1];
	    System.arraycopy(list,0,tmp,0,list.length);
	    list = tmp;
	}
    }

    public void push(String s){
	extend();
       	top++;
	list[top] = s;
    }

    public String pop(){
	if (top == -1)
	    return null;
	String ans = list[top];
	list[top] = null;
	top--;
	return ans;
    };


    public int size(){
	return top+1;
    }

    public String peek(){
	return list[top];
    }

    public boolean isEmpty(){
	return top==-1;
    }

    public String toString(){
	String s = "";
	for (int x = 0; x <= top;x++){
	    s = s + list[x] + ", ";
	}
	return s.substring(0,s.length()-2);
    }

}
