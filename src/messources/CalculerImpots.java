package messources;

public class CalculerImpots {
	
	public int calculerimpôts(int salairebrut, int nombreparts) {

		if (nombreparts > 5)
			throw new IllegalArgumentException("Le nombre de parts doit être inférieur à 6");

		if (nombreparts == 0)
			throw new ArithmeticException("Le nombre de parts doit être supérieur à 0");
	            
	        return Integer.divideUnsigned(salairebrut, nombreparts);
	    }
	
}
