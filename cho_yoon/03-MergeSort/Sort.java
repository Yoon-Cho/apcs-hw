public class Sort{

    public int[] insertionSort(int[] A){
	int[] answer = new int[A.length];
	answer[0] = A[0];
	for (int i = 1; i < A.length; i++){
	    for (int x = 0; x <= i; x++){
		if (x == i)
		    answer[x] = A[x];
		else if (A[x] < answer[x-1]){
		    
		}
	    }
	}
    }

    public int[] mergeSort(int[] A){
	int[] answer;
	if(A.length <= 1){
	    return A;
	}else{
	    int[] h1 = new int[A.length/2]; 
	    int[] h2 = new int[A.length - h1.length];;
	    System.arraycopy(A,0,h1,0,h1.length);
	    System.arraycopy(A,h1.length,h2,0,h2.length);
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    answer = merge(h1,h2);
	    return answer; 
	}
    }

    public int[] merge(int[] h1, int[] h2){
	int[] answer = new int[h1.length + h2.length];
	int x = 0;
	int y = 0;
	int z = 0;
	while (x < h1.length && y < h2.length){
	    if (h1[x] < h2[y]){
		answer[z] = h1[x];
		x++;
	    }else if (h2[y] <= h1[x]){
		answer[z] = h2[y];
		y++;
	    }
	    z++;
	}
	while (x < h1.length){
	    answer[z] = h1[x];
	    x++;
	    z++;
	}
	while (y < h2.length){
	    answer[z] = h2[y];
	    y++;
	    z++;
	}
	return answer;
    }

    public static void main(String[] args){
	Sort A = new Sort();
	int[] h = {1,7,2,5,9,3,1,4,8,4,2,7,8,1,4,87,1,87,3,5,2,57,87,3,7,12,7,2,4,8,2,4,78,21,89,6,1,89,7,54,3,38,6,2,1,89,8,2,4};
	String s = "";
	h = A.mergeSort(h);
	for (int x = 0; x < h.length; x++){
	    s = s + h[x] + " ";
	}
	System.out.println(s);
    }
}
