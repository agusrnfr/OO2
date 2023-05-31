package ar.edu.unlp.info.oo2.rw.model;

public class NuclearCaterpillarRobotWithBombs extends NuclearCaterpillarRobot
{
    public NuclearCaterpillarRobotWithBombs(String name) {
        super(name);
    }
    
    /**
     * This method is an exact replica of the one in class NuclearOvercraftRobotWithBombs
     * THAT IS NOT GOOD!!
     */
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }
}
