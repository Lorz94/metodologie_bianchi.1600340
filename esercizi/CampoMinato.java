
public class CampoMinato {
	public enum Stato { PERSO, VINTO, IN_GIOCO }
	
	int N;
	int M;
	private int[][] campo;
	private boolean[][] scoperto;
	private int mine;
	int numCoperti;
	private Stato stato = Stato.IN_GIOCO;
	/**
	 * costruttore della classe, inizializza una nuova partita su una griglia NxM con un numero specificato di mine 
	 * @param N
	 * @param M
	 * @param mine
	 */
	public CampoMinato(int N, int M, int mine) {
		this.N = N;
		this.M = M;
		this.mine = Math.min(mine, N*M);
		
		this.campo = new int[N][M];
		this.scoperto = new boolean[N][M];
		this.numCoperti = N*M;
		
		piazzaBombe();
	}
	
	/**
	 * Dispone le bombe casualmente sul campo vuoto, incrementando le celle adiacenti
	 */
	private void piazzaBombe() {
		for (int m = 0; m < mine; ++m) {
			int x = (int) (Math.random()*N);
			int y = (int) (Math.random()*M);
			
			while (this.campo[x][y] == -1) {
				x = (int) (Math.random()*N);
				y = (int) (Math.random()*M);
			}
			
			this.campo[x][y] = -1;

			for (int j = Math.max(0, x-1); j < Math.min(N, x+2); ++j)
				for (int i = Math.max(0, y-1); i < Math.min(M, y+2); ++i)
					if (campo[j][i] != -1)
						++campo[j][i];
		}
	}
	/**
	 * scopre la cella indicata dalle coordinate, se ha valore 0 scopre ricorsivamente
	 * le celle adiacenti finchè non ne trova una non nulla
	 * @param x prima coordinata
	 * @param y seconda coordinata
	 * @return -1 se la cella contiene una mina, altrimenti il numero di mine adiacenti in ogni direzione
	 */
	public int scopri(int x, int y) {
		if (scoperto[x][y])
			return campo[x][y];
		
		scoperto[x][y] = true;
		--numCoperti;
		//System.out.println(this.toString());
		
		if (stato == Stato.IN_GIOCO && campo[x][y] == -1)
			stato = Stato.PERSO;
		else if (stato == Stato.IN_GIOCO && numCoperti == mine)
			stato = Stato.VINTO;
		
		if (campo[x][y] == 0)
			for (int j = Math.max(0, x-1); j < Math.min(N, x+2); ++j)
				for (int i = Math.max(0, y-1); i < Math.min(M, y+2); ++i)
					if (campo[j][i] >= 0)
						scopri(j, i);
		
		return campo[x][y];
	}
	
	/**
	 * 
	 * @return lo stato del gioco
	 */
	public Stato vinto() {
		return stato;
	}
	/**
	 * Restituisce una stringa che rappresenta lo stato attuale del campo
	 */
	public String toString() {
		String result = "";
		
		for (int j = 0; j < this.M; ++j) {
			for (int i = 0; i < this.N; ++i) {
				if (!scoperto[i][j])
					result += "   ";
				else if (campo[i][j] == -1)
					result += campo[i][j] + " ";
				else
					result += " " + campo[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}

}
