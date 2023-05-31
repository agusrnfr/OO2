package ar.edu.unlp.info.oo2.rw.model;

public abstract class Robot
{
    String name;
	int batteryLevel = 100;
   
    public Robot (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void step() {
        this.move();
        this.consumeBattery();
        this.fireArms();
        this.collectArtifacts();
    }
    
    public abstract void move();
    
    public abstract void consumeBattery();
    
    public abstract void fireArms();
    
    public void collectArtifacts() {
        System.out.println("Robot " + this.getName() + " collecting");
    }
    
}
