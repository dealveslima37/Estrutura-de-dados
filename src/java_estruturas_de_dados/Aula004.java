package java_estruturas_de_dados;

import java_estruturas_de_dados.vetor.Vetor;

public class Aula004 {
	public static void main(String[] args) {
		
		var vetor = new Vetor(3);
		
		try {
			vetor.adicionar("Hazel");
			vetor.adicionar("Reyna");
			vetor.adicionar("Agatha");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Tamanho do vetor: " + vetor.getTamanho());
		System.out.println(vetor);
		
	}
}
