
public class Filtro {
	public enum Tipo { PASSA_BASSO, PASSA_ALTO, FILTRA };
	
	private int[] array;
	
	public Filtro(int[] array) {
		this.array = array;
	}
	
	private boolean controlla(int j, int k, Tipo tipoFiltro) {
		return switch (tipoFiltro) {
			case PASSA_BASSO -> j <= k;
			case PASSA_ALTO -> j >= k;
			case FILTRA -> j != k;
		};
	}
	
	private int[] filtra(int[] k, Tipo tipoFiltro) {
		int count = 0;
		
		for (int i = 0; i < array.length; ++i) {
			++count;
			
			for (int j = 0; j < k.length; ++j) {
				if (!controlla(array[i], k[j], tipoFiltro)) {
					--count;
					break;
				}
			}
		}
		
		int[] result = new int[count];
		count = 0;
		
		for (int i = 0; i < array.length && count < result.length; ++i) {
			result[count++] = array[i];
		
			for (int j = 0; j < k.length; ++j) {
				if (!controlla(array[i], k[j], tipoFiltro)) {
					--count;
					break;
				}
			}
		}
		
		return result;
	}
	
	public int[] passaBasso(int k) {
		return filtra(new int[]{k}, Tipo.PASSA_BASSO);
	}
	
	public int[] passaAlto(int k) {
		return filtra(new int[]{k}, Tipo.PASSA_ALTO);
	}
	
	public int[] filtra(int k) {
		return filtra(new int[]{k}, Tipo.FILTRA);
	}
	
	public int[] filtra(int[] k) {
		return filtra(k, Tipo.FILTRA);
	}
}
