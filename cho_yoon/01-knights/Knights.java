import java.io.*;
import java.util.*;

public class Knights{

    private int[][] board;
    private int place;
    private boolean solved = false;
    
    public Knights(int size){
	board = new int[size][size];
	place = 0;
	for (int x = 0;x<size;x++){
	    for (int y = 0;y<size;y++){
		board[x][y] = 0;
	    }
	}
    }

    public String toString(){
	String s = "";
       	for (int x = 0;x<board.length;x++){
	    for (int y = 0;y<board.length;y++){
		s = s + board[x][y] + "  ";
	    }
	    s += "\n";
	}	
	return s;
    }

    public void delay(int n){
	try{
	    Thread.sleep(n);
	}catch (InterruptedException e){
	    System.exit(0);
	}
    }

    public void solve(int x, int y){
	delay(250);
	if (place == board.length * board.length){
	    solved = true;
	    System.out.println(this);
	    return;
	}else if (board[x][y] == 0 && x < board.length && y < board.length && x >= 0 && y >=0){
	    place++;
	    board[x][y] = place;
	    System.out.println(this);
	    try{
		solve(x+2,y+1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x+2,y-1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x-2,y+1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x-2,y-1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x+1,y+1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x+1,y-1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x-1,y+1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	    try{
		if (!solved)
		    solve(x-1,y-1);
	    }catch(ArrayIndexOutOfBoundsException e){
		int z = 0;
	    }
	}else{
	    return;
	}
    }
    public static void main(String[] args){
	Knights k = new Knights(5);
	k.solve(0,0);
    }
}

