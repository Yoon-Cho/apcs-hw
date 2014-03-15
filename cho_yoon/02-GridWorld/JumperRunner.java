import info.gridworld.actor.ActorWorld;
import info.gridworld.actor;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumperRunner{
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();

	world.add(new Jumper());
	world.add(new Jumper());
	world.add(new Jumper());
	world.add(new Jumper());
	world.add(new Jumper());
	world.add(new Rock());
	world.add(new Flower());
	world.add(new Bug());
	world.show();
    }
}