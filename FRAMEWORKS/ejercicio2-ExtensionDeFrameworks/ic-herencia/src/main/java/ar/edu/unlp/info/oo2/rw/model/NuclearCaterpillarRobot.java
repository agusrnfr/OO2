package ar.edu.unlp.info.oo2.rw.model;

public abstract class NuclearCaterpillarRobot extends NuclearRobot
{
    public NuclearCaterpillarRobot(String name) {
        super(name);
    }
    
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on caterpillar");
    }
}
