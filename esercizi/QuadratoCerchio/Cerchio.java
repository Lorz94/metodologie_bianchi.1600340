
public class Cerchio {
	int raggio;
	
	/**
	 * Costruttore della classe
	 * @param raggio
	 */
	public Cerchio(int raggio) {
		this.raggio = raggio;
	}
	
	/**
	 * Metodo della classe
	 * @return la circonferenza
	 */
	public double getCirconferenza() {
		return (2*raggio)*Math.PI;
	}
	
	/**
	 * Metodo della classe
	 * @return l'area
	 */
	public double getArea() {
		return Math.pow(raggio, 2)*Math.PI;
	}
}
