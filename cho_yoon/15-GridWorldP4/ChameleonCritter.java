import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class ChameleonCritter extends Critter{

    private static final double dark = 0.05;

    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0){
	    darken();
	    return;
	}
        int r = (int) (Math.random() * n);

        Actor other = actors.get(r);
        setColor(other.getColor());
    }

    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }

    public void darken(){
	Color c = getColor();
	int red = (int)(c.getRed()*(1-dark));
	int green = (int)(c.getGreen()*(1-dark));
	int blue = (int)(c.getBlue()*(1-dark));
	setColor(new Color(red,green,blue));
    }
}
