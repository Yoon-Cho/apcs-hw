import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class BugTester{

    public static void main(String[] args){

	int[] turns = {16,6,23,465,8};

	ActorWorld world = new ActorWorld();

	BoxBug jason = new BoxBug(6);
	jason.setColor(Color.RED);

	CircleBug billy = new CircleBug(4);
	billy.setColor(Color.BLUE);

	SpiralBug trini = new SpiralBug(1);
	trini.setColor(Color.YELLOW);

	ZBug zack = new ZBug(7);
	zack.setColor(Color.BLACK);

	DancingBug kimberly = new DancingBug(turns);
	kimberly.setColor(Color.PINK);



	world.add(new Location(7, 8), jason);
	world.add(new Location(5, 5), billy);
	world.add(new Location(8, 8), trini);
	world.add(new Location(1, 4), zack);
	world.add(new Location(7, 3), kimberly);



	world.show();
    }

} 
