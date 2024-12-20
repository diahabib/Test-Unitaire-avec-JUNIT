package messoures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import messources.CalculerImpots;

class CalculerImpotsTest {
	
	@Test(expected=IllegalArgumentException.class)
    @DisplayName("Test: nombre de parts > 5 doit lancer IllegalArgumentException")
	public void throwsIllegalArgumentExceptionWhenNombreDePartsGreaterThanCinq() {
	    CalculerImpots classe = new CalculerImpots();
	    classe.calculerimpôts(1500, 6);
	}

	@Test(expected=ArithmeticException.class)
	public void throwsArithmeticExceptionWhenNombreDePartsZero() {
	    CalculerImpots classe = new CalculerImpots();
	    classe.calculerimpôts(1500, 0);
	}

	@Test
	public void shouldReturn10000ForRevenu50000AndNombreParts5() {
	    CalculerImpots classe = new CalculerImpots();
	    assertEquals("50000 / 5 donne 10.000", 10000, classe.calculerimpôts(50000, 50));
	}
}
