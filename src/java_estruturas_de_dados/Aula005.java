package java_estruturas_de_dados;

import java_estruturas_de_dados.vetor.Vetor;

public class Aula005 {
	public static void main(String[] args) {

		var vetor = new Vetor(3);

		try {
			vetor.adicionar("Hazel");
			vetor.adicionar("Reyna");
			vetor.adicionar("Agatha");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println(vetor.buscar(2));
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
