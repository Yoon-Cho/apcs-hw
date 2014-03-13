public class Sort{

    public int[] insertionSort(int[] list){
        int[] answer = list;
        int replace = 0;
        for (int x = 1; x < list.length; x++){
            int move = answer[x];
            for (int counter = x-1; counter >= 0 && answer[counter] > move; counter--){
                answer[counter+1] = answer[counter];
                replace = counter-1;
            }
            answer[replace+1] = move;
        }
        return answer;
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

    public String[] mergeSortS(String[] A){
        String[] answer;
        if(A.length <= 1){
            return A;
        }else{
            String[] h1 = new String[A.length/2];
            String[] h2 = new String[A.length - h1.length];;
            System.arraycopy(A,0,h1,0,h1.length);
            System.arraycopy(A,h1.length,h2,0,h2.length);
            h1 = mergeSortS(h1);
            h2 = mergeSortS(h2);
            answer = mergeS(h1,h2);
            return answer;
        }
    }

    public String[] mergeS(String[] h1, String[] h2){
        String[] answer = new String[h1.length + h2.length];
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < h1.length && y < h2.length){
            if (h1[x].charAt(0) < h2[y].charAt(0)){
                answer[z] = h1[x];
                x++;
            }else if (h2[y].charAt(0) < h1[x].charAt(0)){
                answer[z] = h2[y];
                y++;
            }else{
		for (int spot = 1;spot+1 < h1[x].length() && spot+1 < h2[y].length() && h1[x].charAt(spot-1)  == h2[y].charAt(spot-1);spot++)
		    if ((h1[x].charAt(spot)) < (h2[y].charAt(spot))){
			answer[x] = h1[x];
			x++;
		    }
		    else if (h2[y].charAt(spot) < h1[x].charAt(spot)){
			answer[y] = h2[y];
			y++;
		    }
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
	int[] l = {1,7,2,5,9,3,1,4,8,4,2,7,8,1,4,87,1,87,3,5,2,57,87,3,7,12,7,2,4,8,2,4,78,21,89,6,1,89,7,54,3,38,6,2,1,89,8,2,4};
	String s = "";
	h = A.mergeSort(h);
	for (int x = 0; x < h.length; x++){
	    s = s + h[x] + " ";
	}
	System.out.println(s);

	String m = "";
	l = A.insertionSort(l);
	for (int x = 0; x < l.length; x++){
	    m = m + l[x] + " ";
	}
	System.out.println(m);

	String[] tester= {"fudge","zap","fudge","puff","hello","harlem","globetrotters","globetrolly","fruits","flapjack","chocobo","xylophone","applestruddel","werewolf"};
	String z = "";
	tester = A.mergeSortS(tester);
	for (int x = 0; x < tester.length; x++){
	    z = z + tester[x] + " ";
	}
	System.out.println(z);
    }
}
