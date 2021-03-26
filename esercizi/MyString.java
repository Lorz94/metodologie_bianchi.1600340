import java.util.ArrayList;

public class MyString {
	/**
	 * costante array di stringhe (utilizzato per svolgere daCifreALettere2)
	 */
	private static final String[] CIFRE = { "zero", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove" };
	
	private String s;
	
	/**
	 * costruttore della classe
	 * @param s
	 */
	public MyString(String s) {
		this.s = s;
	}
	
	/**
	 * costruttore che prende come parametro un intero e memorizza nella stringa s
	 * una rappresentazione in formato stringa dell'argomento
	 * @param k
	 */
	public MyString(int k) {
		this.s = String.valueOf(k);
	}
	
	/**
	 * metodo che restituisce tutti i suffissi di una stringa
	 * @return un array di n stringhe, dove n è la lunghezza della stringa di cui si vogliono i suffissi
	 */
	public String[] getSuffixArray() {
		String[] val = new String[s.length()];
		
		for (int i = 0; i < s.length(); ++i)
			val[i] = s.substring(i);
		
		return val;
	}
	
	/**
	 * metodo che restituisce tutti i suffissi di una stringa utilizzando ArrayList
	 * @return una lista di n stringhe, dove n è la lunghezza della stringa di cui si vogliono i suffissi
	 */
	public ArrayList<String> getSuffixList() {
		ArrayList<String> val = new ArrayList<String>();
		
		for (int i = 0; i < s.length(); ++i)
			val.add(s.substring(i));
		
		return val;
	}
	
	/**
	 * metodo per vedere se una stringa è palindroma
	 * @return true se è palindroma, false altrimenti
	 */
	public boolean isPalindroma() {
		for (int i = 0, j = s.length()-1; i <= j; ++i, --j)
			if (s.charAt(i) != s.charAt(j))
				return false;
			
		return true;
	}
	
	public String daLettereACifre(String[] stringa) {
		String result = "";
		
		for (int i = 0; i < stringa.length; ++i) {
			switch(stringa[i]) {
				case "zero" -> result += "0 ";
				case "uno" -> result += "1 ";
				case "due" -> result += "2 ";
				case "tre" -> result += "3 ";
				case "quattro" -> result += "4 ";
				case "cinque" -> result += "5 ";
				case "sei" -> result += "6 ";
				case "sette" -> result += "7 ";
				case "otto" -> result += "8 ";
				case "nove" -> result += "9 ";
				case "dieci" -> result += "10 ";
			} 
		}
		
		return result;
	}
	
	public String daCifreALettere(String stringa) {
		String result = "";
		
		for (int i = 0; i < stringa.length(); ++i) {
			switch(stringa.charAt(i)) {
				case '0': result += "zero "; break;
				case '1': result += "uno "; break;
				case '2': result += "due "; break;
				case '3': result += "tre "; break;
				case '4': result += "quattro "; break;
				case '5': result += "cinque "; break;
				case '6': result += "sei "; break;
				case '7': result += "sette "; break;
				case '8': result += "otto "; break;
				case '9': result += "nove "; break;
			}
		}
		
		return result;
	}
	
	/**
	 * daCifreALettere metodo alternativo più elegante
	 * @param stringa
	 * @return una stringa contentente la rappresentazione a parole delle cifre
	 */
	public String daCifreALettere2(String stringa) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < stringa.length(); ++i)
			if (Character.isDigit(stringa.charAt(i)))
				sb.append(CIFRE[stringa.charAt(i) - '0']).append(" ");
		
		return sb.toString();
	}
	
	public String toString() {
		return s;
	}

}
