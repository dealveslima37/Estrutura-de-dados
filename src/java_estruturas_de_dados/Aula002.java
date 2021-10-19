package java_estruturas_de_dados;

import java_estruturas_de_dados.vetor.Vetor;

public class Aula002 {
	public static void main(String[] args) {

		var vetor = new Vetor(2);
		
		try {
			vetor.adicionar("Alexandre");
			vetor.adicionar("Maria");
			vetor.adicionar("Kendra");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
