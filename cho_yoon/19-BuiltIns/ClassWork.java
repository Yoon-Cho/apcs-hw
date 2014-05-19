import java.util.*;

public class ClassWork{

    public static void main(String[] args){
	Map h = new HashMap();
	Map t = new TreeMap();
	int m = (int)'a';
	long first = System.currentTimeMillis();
	for(int x = 0; x < 26; x++){
	    h.put((char)(m+x),x+1);
	}
	long second = System.currentTimeMillis();
	System.out.println(second-first);
	for(int y = 0; y < 26; y++){
	    t.put((char)(m+y),y+1);
	}
	long third = System.currentTimeMillis();
	System.out.println(third=second);
    }




}
