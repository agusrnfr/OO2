package ar.edu.unlp.info.oo2.ejercicio22_Monitoreo;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20) && tank.mixerPower(5);
	}

}
