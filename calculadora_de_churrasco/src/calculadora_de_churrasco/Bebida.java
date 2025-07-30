package calculadora_de_churrasco;

public class Bebida implements ItemChurrasco{
	private String nome;
	private double litrosPorPessoaAdulto;
	private double litrosPorPessoaCrianca;
	public Bebida(String nome, double litrosPorPessoaAdulto, double litrosPorPessoaCrianca) {
		
		this.nome = nome;
		this.litrosPorPessoaAdulto = litrosPorPessoaAdulto;
		this.litrosPorPessoaCrianca = litrosPorPessoaCrianca;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public double calcularQuantidadeTotal(int numAdultos, int numCriancas) {
		return (numAdultos*litrosPorPessoaAdulto)+(numCriancas*litrosPorPessoaCrianca);
		
	}
	
}
