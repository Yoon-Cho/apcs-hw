import java.util.*;

public class Sort{

    public ArrayList<Person> mergeSort(ArrayList<Person> B){
	ArrayList<Person> A = B;
	ArrayList<Person> answer;
	if(A.size() <= 1){
	    return A;
	}else{
	    ArrayList<Person> h1 = new ArrayList<Person>(A.size());
	    h1.addAll(0,A);
	    h1.removeRange(A.size()/2,A.size()-1);
	    h1.remove(h1.size()-1);
	    ArrayList<Person> h2 = new ArrayList<Person>(A.size());
	    h2.addAll(0,A);
	    h2.removeRange(0,h1.size()-1);
	    System.arraycopy(A,0,h1,0,h1.size());
	    System.arraycopy(A,h1.size(),h2,0,h2.size());
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    answer = merge(h1,h2);
	    return answer; 
	}
    }

    public ArrayList<Person> merge(ArrayList<Person> h1, ArrayList<Person> h2){
	ArrayList<Person> answer = new ArrayList<Person>(h1.size() + h2.size());
	int x = 0;
	int y = 0;
	int z = 0;
	while (x < h1.size() && y < h2.size()){
	    if (h1.get(x).compareTo(h2.get(y)) == -1){
		answer.set(z, h1.get(x));
		x++;
	    }else{
		    answer.set(z, h2.get(y));
		y++;
	    }
	    z++;
	}
	while (x < h1.size()){
	    answer.set(z, h1.get(x));
	    x++;
	    z++;
	}
	while (y < h2.size()){
	    answer.set(z, h2.get(y));
	    y++;
	    z++;
	}
	return answer;
    }

    public static void main(String[] args){
	Sort A = new Sort();
	ArrayList<Person> h = new ArrayList<Person>(100);

	for(int x = 0;x < 100;x++){
	    h.add(new Person());
	}

	String s = "";
	h = A.mergeSort(h);
	for (int x = 0; x < h.size(); x++){
	    s = s + h.get(x) + " ";
	}
	System.out.println(s);
    }
}
