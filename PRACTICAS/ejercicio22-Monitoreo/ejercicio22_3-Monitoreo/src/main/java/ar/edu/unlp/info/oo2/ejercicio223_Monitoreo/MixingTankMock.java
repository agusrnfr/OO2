package ar.edu.unlp.info.oo2.ejercicio223_Monitoreo;

public class MixingTankMock extends MixingTank {
    private int heatPower;
    private int mixerPower;
    private double volume;
    private long timeElapsed;

    public MixingTankMock() {
        this.heatPower = 0;
        this.mixerPower = 0;
        this.volume = 100;
    }

    public boolean heatPower(int percentage) {
        if (percentage < 0 || percentage > 100) {
            return false;
        }
        this.heatPower = percentage;
        return true;
    }

    public boolean mixerPower(int percentage) {
        if (percentage < 0 || percentage > 100) {
            return false;
        }
        this.mixerPower = percentage;
        return true;
    }

    public boolean purge() {
        if (this.volume == 0) {
            return false;
        }
        try {
            Thread.sleep(4000); // Suspender la ejecución durante 4 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.volume = 0; // Establecer volume en 0
        return true;
    }


    public double upTo() {
        return this.volume;
    }

    public double temperature() {
        if (this.heatPower == 100) {
            return this.timeElapsed * 5.0;
        }
        if (this.heatPower == 75) {
        	return this.timeElapsed * 4.0;
        }
        if (this.heatPower == 50) {
        	return this.timeElapsed * 2.0;
        } 
        if (this.heatPower == 25) {
        	return this.timeElapsed * 1.0;
        }
        
        return 0.0;
    }
    
    public void updateElapsedTime(long time) {
        this.timeElapsed += time;
    }
}