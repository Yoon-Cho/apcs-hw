import info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Actor{

    public Jumper(){
	setColor(Color.RED);
    }

    public void act(){
	if (canMoveTwo())
	    moveOne();
	else if (canMoveOne())
	    moveTwo();
	else
	    turn();
    }

    public void turn(){
	setDirection(getDirection() + Location.HALF_RIGHT);
    }

    public void moveTwo(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (gr.isValid(next))
	    moveTo(next);
	else
	    removeSelfFromGrid();
    }

    public void moveOne(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if (gr.isValid(next))
	    moveTo(next);
	else
	    removeSelfFromGrid();
    }

    public boolean canMoveTwo(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (!gr.isValid(next))
	    return false;
    }

    public boolean canMoveOne(){
	Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
    }
}
