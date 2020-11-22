package model;

import util.SomadorEsperado;

public class Cliente {
	private SomadorEsperado somador;
	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}
	public String executar(int[] vetor) {
		int soma = somador.somaVetor(vetor);
		return "Resultado: " + soma;
	}
}
