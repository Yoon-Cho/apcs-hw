import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{

    private int[] turns;
    private int counter;

    public DancingBug(int[] array)
    {
	turns = array;
	counter = 0;
    }

    public void act()
    {
	if (counter == (turns.length - 1))
	    counter = 0;
	if (canMove()){
	    move();
	}
	else{
	    for (int y = 0; y < (turns[counter] % 8); y++){
		turn();
	    }
	    counter++;
	}
    }
}   
