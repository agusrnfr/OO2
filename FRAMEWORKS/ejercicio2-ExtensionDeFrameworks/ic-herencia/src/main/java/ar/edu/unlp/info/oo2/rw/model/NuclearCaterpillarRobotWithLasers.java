package ar.edu.unlp.info.oo2.rw.model;

public class NuclearCaterpillarRobotWithLasers extends NuclearCaterpillarRobot
{
    public NuclearCaterpillarRobotWithLasers(String name) {
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
