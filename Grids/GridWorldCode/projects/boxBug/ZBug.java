import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int times;

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	times = 0;
	setDirection(90);
    }

    public void act()
    {
        if (times < 3){
	    if (steps < sideLength && canMove())
		{
		    move();
		    steps++;
		}
	    else
		{
		    if (times == 2 && canMove()){
			times++;
			steps = 0;
		    }
		    if (times == 1 && canMove()){
			setDirection(90);
			times++;
			steps = 0;
		    }
		    if (times == 0 && canMove()){
			setDirection(225);
			times++;
			steps = 0;
		    }
		}
	}	
    }
}
