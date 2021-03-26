
public class Contatore {
	private int value;
	/**
	 * Costruttore della classe
	 */
	public Contatore() {
		value = 0;
	}
	/**
	 * Costruttore della classe con input
	 * @param value
	 */
	public Contatore(int value) {
		this.value = value;
	}
	/**
	 * Metodo della classe
	 * Incrementa value
	 */
	public void count() {
		value++;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void reset(int value) {
		this.value = value;
	}
	/**
	 * Ottiene il valore corrente di value
	 * @return valore intero del contatore
	 */
	public int getValue() {
		return  value;
	}

}
