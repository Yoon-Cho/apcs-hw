import java.util.*;

public class MaxHeap{

    private int[] data;
    private int size;

    public MaxHeap(){
	size = 0;
    }

    public void add(int x){
	data[size] = x;
	size++;
	int temp = size;
	while (data[temp] > data[temp/2]){
	    swap(data,temp,temp/2);
	    temp = temp/2;
	}
    }

    public void swap(int[] data,int pos1,int pos2){
	int temp = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = temp;
    }

    public int remove(int x){
	return 0;
    }

    public int findMedian(){
	int[] sorted = data;
	Arrays.sort(sorted);
	if (sorted.length % 2 == 0)
	    return sorted[sorted.length/2]+sorted[sorted.length/2-1];
	else
	    return sorted[sorted.length/2];
    }
   
    public int removeMedian(int x){
	int answer = 0;
	int[] sorted = data;
	Arrays.sort(sorted);
	if (data.length%2 == 0){
	    answer = sorted[(sorted.length/2)]+sorted[(sorted.length/2-1)];
	    remove(sorted[sorted.length/2]);
	    remove(sorted[sorted.length/2]);
	    return answer;
	}else{
	    answer = sorted[(sorted.length/2)];
	    remove(sorted[sorted.length/2]);
	    return answer;
	}
    }

}
