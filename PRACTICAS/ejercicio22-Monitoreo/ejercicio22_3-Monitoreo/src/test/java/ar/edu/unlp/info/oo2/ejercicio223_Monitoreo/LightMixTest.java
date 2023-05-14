package ar.edu.unlp.info.oo2.ejercicio223_Monitoreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightMixTest {
	
	private ProcessStep lightMix;
	private MixingTank mixingTankMock;

	@BeforeEach
	void setUp() throws Exception {
		lightMix = new LightMix();
		mixingTankMock = new MixingTankMock();
	}

	@Test
	void testLightMixStub() {
		lightMix.execute(mixingTankMock);
		assertTrue(lightMix.isDone());	
	}

}