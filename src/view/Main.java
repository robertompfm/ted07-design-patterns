package view;

import model.Cliente;
import util.Adapter;
import util.SomadorExistente;

public class Main {
	
	public static void main(String[] args) {
		SomadorExistente somadorExistente = new SomadorExistente();
		Adapter adaptador = new Adapter(somadorExistente);
		Cliente cliente = new Cliente(adaptador);
		String resultado = cliente.executar(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		System.out.println(resultado);
	}
}
