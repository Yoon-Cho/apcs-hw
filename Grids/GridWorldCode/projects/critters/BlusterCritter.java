import info.gridworld.actor.Actor;	      
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter{

    private int number;

    public BlusterCritter(int c){
	super();
	number = c;
    }

    public void brighten(){
	Color c = getColor();
	setColor(new Color(c.getRed()+0.5,c.getGreen()+0.5,c.getBlue()+0.5));
    }

    public void darken(){
	Color c = getColor();
	setColor(new Color(c.getRed()-0.5,c.getGreen()-0.5,c.getBlue()-0.5));
    }

    public ArrayList<Actor> getActors(){
	ArrayList<Actor> actors = new ArrayList<Actor>();
	Location l = getLocation();
	for (int x = l.getRow() -2;x <= l.getRow() + 2; x++){
	    for (int y = l.getCol() -2;x <= l.getCol() + 2;y++){
		Actor a = getGrid().get(new Location(x,y));
		if (a != null && a != this)
		    actors.add(a);
	    }
	}
	return actors;
    }

    public void processActors(ArrayList<Actor> actors){
	int c = 0;
	for (int x = 0; x < actors.length(); x++){
	    if (actors.get(x) instanceof Critter)
		c++;
	}
	if (c < number)
	    lighten();
	else
	    darken();
    }

}
