package ar.edu.unlp.info.oo2.rw.model;

public class SolarPanel extends EnergySource
{
    public void consumeBattery(Robot r) {
        System.out.println("Robot " + r.getName() + " using nuclear energy");
    }
 
}
