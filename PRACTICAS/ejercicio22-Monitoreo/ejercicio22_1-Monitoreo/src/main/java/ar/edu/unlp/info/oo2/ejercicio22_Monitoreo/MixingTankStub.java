package ar.edu.unlp.info.oo2.ejercicio22_Monitoreo;

import java.util.Random;

public class MixingTankStub extends MixingTank{

	@Override
	public boolean heatPower(int percentage) {
		return true;
	}

	@Override
	public boolean mixerPower(int percentage) {
		return true;
	}

	@Override
	public boolean purge() {
		return true;
	}

	@Override
	public double upTo() {
		Random rand = new Random();
		return rand.nextInt(101);
	}

	@Override
	public double temperature() {
		Random rand = new Random();
		return rand.nextDouble(101);
	}

}
