public class PoisonTrap extends Room {



	public PoisonTrap(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("As yo0u walk into the room, you hear the door behind you slamming shut. A gas begins to fill the room from small slits"
				+ " in the walls.");
	}
	

}
