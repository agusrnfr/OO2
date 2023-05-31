package ar.edu.unlp.info.oo2.rw.model;

public class PanelCaterpillarRobotWithBombs extends PanelCaterpillarRobot {

	public PanelCaterpillarRobotWithBombs(String name) {
		super(name);
	}

	@Override
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }

}
