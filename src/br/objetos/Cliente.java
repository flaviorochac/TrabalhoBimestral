package br.objetos;

import br.anotacao.Tabela;
import br.anotacao.Coluna;
import br.enums.tipo.EstadoCivil;

@Tabela("TAB_CLIENTE")
public class Cliente {
	
	@Coluna(nome = "ID_CLIENTE" , pk = true , tm = 10)
	private int id;
	
	@Coluna(tm = 10)
	private String nome;
	
	@Coluna(nome = "END_CLIENTE" , tm = 10)
	private String endere�o;
	
	@Coluna(nome = "TEL_CLIENTE" , tm = 10)
	private int telefone;
	
	@Coluna(tm = 10)
	private EstadoCivil estadoCivil;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
