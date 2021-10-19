package java_estruturas_de_dados.vetor;

public class Vetor {

	private String[] elementos;
	private Integer tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		tamanho = 0;
	}

	public void adicionar(String elemento) {
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new ArrayIndexOutOfBoundsException("Array cheio");
		}
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public String buscar(int posicao) {
		if (!(posicao >= 0 && posicao < elementos.length)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		return elementos[posicao];
	}

	public int buscar(String elemento) {
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] != null) {
				sb.append(elementos[i]);
			}
			sb.append(" ");
		}

		return sb.toString();
	}

}
