package ar.edu.unlp.info.oo2.rw.model;

public abstract class PanelRobot extends Robot {;

	public PanelRobot(String name) {
		super(name);
	}
	
    public void consumeBattery() {
        System.out.println("Robot " + this.getName() + " using solar panel energy");
    }
	

}
