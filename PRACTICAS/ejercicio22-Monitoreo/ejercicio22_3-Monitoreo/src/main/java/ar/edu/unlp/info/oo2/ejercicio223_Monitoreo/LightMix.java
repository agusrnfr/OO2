package ar.edu.unlp.info.oo2.ejercicio223_Monitoreo;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		tank.heatPower(100);
		tank.updateElapsedTime(2);
		if (tank.temperature()-temp == 10) {
			tank.mixerPower(5);
			return true;
		}
		else {
			return false;
			}
	}

}
