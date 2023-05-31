package ar.edu.unlp.info.oo2.rw.model;

public class Robot
{
    String name;
    Locomotion locomotion;
    EnergySource energySource;
    ArmsSystem armsSystem;
    ItemsCollector collector;
       
    public Robot (String name, Locomotion locomotion,
          EnergySource energySource, ArmsSystem armsSystem) {
        this.collector = new ItemsCollector();
        this.locomotion = locomotion;
        this.energySource = energySource;
        this.armsSystem = armsSystem;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void step() {
        locomotion.move(this);
        energySource.consumeBattery(this);
        armsSystem.fireArms(this);
        collector.collectArtifacts(this);
    }
    
}
