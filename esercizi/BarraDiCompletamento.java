
public class BarraDiCompletamento {
	private int percentuale;
	
	/**
	 * Costruttore della classe
	 * @param percentuale iniziale
	 */
	public BarraDiCompletamento(int percentuale) {
		this.percentuale = percentuale;
	}
	
	/**
	 * Metodo della classe che incrementa la percentuale
	 * @param incremento : di quanto bisogna incrementare
	 */
	public void incrementa(int incremento) {
		percentuale += incremento;
	}
	
	/**
	 * Metodo della classe che restituisce una stringa della percentuale
	 */
	public String toString() {
		return "percentuale = " + percentuale;
	}

}
