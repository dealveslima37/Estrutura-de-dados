package java_estruturas_de_dados;

import java_estruturas_de_dados.vetor.Vetor;

public class Aula006 {
	public static void main(String[] args) {

		var vetor = new Vetor(6);

		try {
			vetor.adicionar("Hazel");
			vetor.adicionar("Reyna");
			vetor.adicionar("Stefany");
			vetor.adicionar("Agatha");
			vetor.adicionar("Amalia");
			vetor.adicionar("Fiona");
		} catch (Exception e) {
			System.out.println(e);
		}

		if (vetor.buscar("Hazel") > -1) {
			System.out.println("Elemento encontrado no vetor");
		} else {
			System.out.println("Elemento não encontrado");
		}

	}
}
