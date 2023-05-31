package ar.edu.unlp.info.oo2.rw.model;

public abstract class PanelOvercraftRobot extends PanelRobot{
	    public PanelOvercraftRobot(String name) {
	        super(name);
	    }
	    
	    public void move() {
	        System.out.println("Robot " + this.getName() + " moving on overcraft");
	}

}
