public class Binary{

    public int rbsearch(int n, int[] L){
	return rbsearch(n,L, 0, L.length-1);
    }

    public int rbsearch(int n, int[]L, int low, int high){
	int mid = (low+high)/2;
	if (low > high)
	    return -1;
	else if (L[mid] == n){
	    return mid;
	}
	
	else if (L[mid] < n){
	    return rbsearch(n,L,mid+1,high);
	}

	else{
	    return rbsearch(n,L,low,mid-1);
	}
    }

    public int ibsearch(int n, int[] L){
	int high = L.length - 1;
	int low = 0;

	while (low <= high){
	    int mid = (low+high)/2;

	    if (L[mid] == n){
		return mid;
	    }else if (L[mid] < n){
		low = mid + 1;
	    }else{ 
		high = mid - 1;
	    }
	}
	return -1;


    }


    public static void main(String[] args){
        Binary tester = new Binary();
	int[] h = {1,1,1,2,2,3,4,5,6,7,7,8,9,10,11,23,34,45,45,67,68,789,99324};  
	System.out.println(tester.rbsearch(34,h));
	System.out.println(tester.ibsearch(34,h));
    }
}
