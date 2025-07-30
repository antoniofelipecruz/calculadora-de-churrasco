package calculadora_de_churrasco;

public class Convidado {
	private String nome;
	private boolean ehAdulto;
	public Convidado(String nome, boolean ehAdulto) {
		this.nome = nome;
		this.ehAdulto = ehAdulto;
	}
	public String getNome() {
		return nome;
	}
	
	public boolean ehAdulto() {
		return ehAdulto;
	}
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", ehAdulto=" + ehAdulto + "]";
	}
	
	
	
	
}
