package entity;

import java.util.List;

/**
 * @author fernando.felix
 *
 */
public class Aluno {
	private String nome;
	private int idade;
	private String genero;
	private List<String> disciplinas;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
