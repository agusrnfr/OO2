package ar.edu.unlp.info.oo2.rw.model;

public abstract class PanelCaterpillarRobot extends PanelRobot{

	public PanelCaterpillarRobot(String name) {
		super(name);
	}
	
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on caterpillar");
}

}
