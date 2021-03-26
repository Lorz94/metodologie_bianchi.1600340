
public class Quadrato {
	private int lato;
	/**
	 * Costruttore della classe
	 * @param lato
	 */
	public Quadrato(int lato) {
		this.lato = lato;
	}
	/**
	 * Metodo della classe
	 * @return il perimetro
	 */
	public int getPerimetro() {
		return lato*4;
	}
}
