
public class Persona {
	String nome;
	String cognome;
	/**
	 * Costruttore della classe
	 * Posso anche evitare di usarlo quando non prende parametri
	 */
	public Persona() {
		nome = null;
		cognome = null;
	}
	/**
	 * Metodo che setta il nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo che setta il cognome
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * Metodo che restituisce il nome e il cognome
	 */
	public void getNomeCognome() {
		System.out.println(nome + " " + cognome);
	}
}
