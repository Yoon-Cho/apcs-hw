public class BinaryHeap{

    public void swap(int[] data,int pos1,int pos2){
	int temp = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = temp;
    }

    public void heapSort(int[] data){

	for (int x=0;x<data.length;x++)
	    System.out.print(data[x]+ " ");
	System.out.println("");

	for (int y = 0; y < data.length; y++){
	    int child = y;
	    while (child > 0){
		int parent = (child-1)/2;
		if (data[child] > data[parent]){
		    swap(data,child,parent);
		    child = parent;
		}
		else
		    child = 0;
	    }
	}
	
	int length = data.length;
	int left = 0;
	int right = 0;
	int root = 0;
	while (true){
	    left = (root*2)+1;
	    right = left-1;
	    if (left >= length)
		break;
	    if (right >= length)
		break;
	    if (data[left] > data[root]){
		if (data[left]>data[right]){
		    swap(data,left,root);
		    root = left;
		}
		else{
		    swap(data,right,root);
		    root = right;
		}
	    }else{
		if (data[right]>data[root]){
		    swap(data,right,root);
		    root = right;
		}else{
		    break;
		}
	    }
	}

	for (int m=0;m<data.length;m++)
	    System.out.print(data[m]+ " ");
	System.out.println("");

    }

    public static void main(String[] args){
	BinaryHeap b = new BinaryHeap();
	int[] x = {26,9,3,2,8,459,2,3,9,4,2,67,9,3,3,8,9,4,7,7};
	b.heapSort(x);
    }
  

    //1. the root will always be greater than its children
    //2. the tree is as full as possible from left to right
    //3. does not use "left" and "right"


    //remove
    //return root
    //take the lowest node, bring it to the highest and replace
    //keep swapping the lowest value number with a higher number and take it back to the bottom
    //restore heap property

    //insert
    //just use a loop



}
