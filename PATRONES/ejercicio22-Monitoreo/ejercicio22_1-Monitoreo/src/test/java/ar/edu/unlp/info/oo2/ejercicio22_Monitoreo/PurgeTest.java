package ar.edu.unlp.info.oo2.ejercicio22_Monitoreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PurgeTest {

	private ProcessStep purge;
	private MixingTank mixingTankStub;

	@BeforeEach
	void setUp() throws Exception {
		purge = new LightMix();
		mixingTankStub = new MixingTankStub();
	}

	@Test
	void testPurgeStub() {
		purge.execute(mixingTankStub);
		assertTrue(purge.isDone());	
	}

}
