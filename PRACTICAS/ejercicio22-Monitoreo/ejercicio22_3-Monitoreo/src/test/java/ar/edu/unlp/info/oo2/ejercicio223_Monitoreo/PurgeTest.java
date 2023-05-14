package ar.edu.unlp.info.oo2.ejercicio223_Monitoreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PurgeTest {

	private ProcessStep purge;
	private MixingTank mixingTankMock;

	@BeforeEach
	void setUp() throws Exception {
		purge = new Purge();
		mixingTankMock = new MixingTankMock();
	}

	@Test
	void testPurgeStub() {
		assertEquals(100,mixingTankMock.upTo());
		purge.execute(mixingTankMock);
		assertTrue(purge.isDone());	
		
		assertEquals(0,mixingTankMock.upTo());
		purge.execute(mixingTankMock);
		assertFalse(purge.isDone());
	}

}
