package util;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements SomadorEsperado {

	private SomadorExistente somador;
	
	public Adapter(SomadorExistente somador) {
		this.somador = somador;
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for (int i : vetor) {
			lista.add(i);
		}
		return somador.somaLista(lista);
	}
}
