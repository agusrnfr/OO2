package ar.edu.unlp.info.oo2.rw.model;

public class PanelCaterpillarRobotWithLasers extends PanelCaterpillarRobot{

	public PanelCaterpillarRobotWithLasers(String name) {
		super(name);
	}
	
	private boolean canFire() {
		if (this.batteryLevel <= 50)
			return true;
		return false;
	}

	@Override
	public void fireArms() {
		if (canFire())
	        System.out.println("Robot " + this.getName() + " firing lasers");
	}

}
