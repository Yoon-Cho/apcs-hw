public class MyStack{

    private int top;
    private int[] list;

    public MyStack(){
	list = new int[10];
	top = -1;
    }

    public void extend(){
	if (top>list.length-2){
	    int[] tmp = new int[list.length+1];
	    System.arraycopy(list,0,tmp,0,list.length);
	    list = tmp;
	}
    }

    public void push(int s){
	extend();
       	top++;
	list[top] = s;
    }

    public int pop(){
	int ans = list[top];
	list[top] = 0;
	top--;
	return ans;
    };


    public int size(){
	return top+1;
    }

    public int peek(){
	return list[top];
    }

    public boolean isEmpty(){
	return top==-1;
    }

    public String toString(){
	String s = "";
	for (int x = top; x > 0;x++){
	    s = s + list[top] + ", ";
	}
	return s.substring(0,s.length()-2);
    }

}
