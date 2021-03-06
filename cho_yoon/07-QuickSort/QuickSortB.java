import java.util.*;

public class QuickSortB{

    public Integer[] quickSort(Integer[] L){
	return quickSort(L,0,L.length-1);
    }

    public Integer[] quickSort(Integer[] L, int low, int high){
	if (L.length <= 1)
	    return L;

	else if (low < high){

	    Random rnd = new Random();
	    int pivotIndex = new Integer(rnd.nextInt(L.length));

	    pivotIndex = L[partition(L, low, high, pivotIndex)];

	    quickSort(L, low, pivotIndex -1);
	    quickSort(L, pivotIndex + 1, high);

	    return L;

   	}else
	    return L;
    }

    public Integer partition(Integer[] A, int L, int R, int Wall){

	int value = A[Wall];


	for (int j = L; j < R; j++){
	    if (A[j] == value){
		swap(A,j,R);
		L++;
	    }
	}

	swap(A,Wall,R);

	return (L+R)/2;

    }

    public void swap(Integer[] L, int a, int b){
	int temp = L[a];
	L[a] = L[b];
	L[b] = temp;
    }

    public static void main(String[] args){
	QuickSortB tester = new QuickSortB();
	Random rnd = new Random();
	Integer[] a = new Integer[15];
	for (int i = 0; i < 15; i++){
	    a[i] = new Integer(rnd.nextInt(100));
	}

	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(tester.quickSort(a)));
    }

}
