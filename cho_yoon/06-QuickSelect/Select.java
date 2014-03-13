import java.util.*;

public class Select{

    public int quickselect(int[] a, int k, int low, int high){
	int pivot = a[new Random().nextInt(high+1)];

	if (low - high == 0 && k != low){
	    return a[k];
	}
	else{
	    while (low < high){
		while (a[low] < pivot)
		    low++;
		while (a[high] > pivot)
		    high--;
	    }
	    int temp = a[low];
	    a[low] = a[high];
	    a[high] = temp;
	
	    if (k < pivot)
		return quickselect(a,k,0,high-low);
	    else
		return quickselect(a,k,high-low,a.length-1);
	}
    }

	public static void main(String[] args){
	    Select y = new Select();
	    int[] list = {1,7,3,9,54,12,976,36,8,23,76};
	    System.out.println(y.quickselect(list,8,0,list.length-1));
	}

    }
