package ar.edu.unlp.info.oo2.rw.model;

public abstract class NuclearOvercraftRobot extends NuclearRobot
{
    public NuclearOvercraftRobot(String name) {
        super(name);
    }
    
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on overcraft");
    }
}
