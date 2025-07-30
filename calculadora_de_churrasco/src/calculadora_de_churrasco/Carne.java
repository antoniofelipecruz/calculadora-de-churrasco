package calculadora_de_churrasco;

public class Carne implements ItemChurrasco{
	private String nome;
	private double gramasPorPessoaAdulto;
	private double gramasPorPessoaCrianca;
	public Carne(String nome, double gramasPorPessoaAdulto, double gramasPorPessoaCrianca) {
		
		this.nome = nome;
		this.gramasPorPessoaAdulto = gramasPorPessoaAdulto;
		this.gramasPorPessoaCrianca = gramasPorPessoaCrianca;
	}
	@Override
	public String getNome() {
		return this.nome;
	}
	@Override
	public double calcularQuantidadeTotal(int numAdultos, int numCriancas) {
		return (numAdultos*gramasPorPessoaAdulto)+(numCriancas*gramasPorPessoaCrianca);
		
	}
	
	
	
	
	

}
