package ar.edu.unlp.info.oo2.ejercicio22_Monitoreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightMixTest {
	
	private ProcessStep lightMix;
	private MixingTank mixingTankStub;

	@BeforeEach
	void setUp() throws Exception {
		lightMix = new LightMix();
		mixingTankStub = new MixingTankStub();
	}

	@Test
	void testLightMixStub() {
		lightMix.execute(mixingTankStub);
		assertTrue(lightMix.isDone());	
	}

}
