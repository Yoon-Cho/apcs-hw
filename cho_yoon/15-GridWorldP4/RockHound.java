import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class RockHound extends Critter{

    public void processActors(ArrayList<Actor> actors){
	for {int x = 0; x < actors.length(); x++){
	    if (actors.get(x) instanceof Rock){
		actors.get(x).removeSelfFromGrid();
	    }
	}
    }

}
