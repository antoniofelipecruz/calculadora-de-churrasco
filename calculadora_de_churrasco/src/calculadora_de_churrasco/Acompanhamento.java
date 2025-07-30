package calculadora_de_churrasco;

public class Acompanhamento implements ItemChurrasco{
	private String nome;
	private double porcoesPorPessoaAdulto;
	private double porcoesPorPessoaCrianca;
	public Acompanhamento(String nome, double porcoesPorPessoaAdulto, double porcoesPorPessoaCrianca) {
	
		this.nome = nome;
		this.porcoesPorPessoaAdulto = porcoesPorPessoaAdulto;
		this.porcoesPorPessoaCrianca = porcoesPorPessoaCrianca;
	}
	@Override
	public String getNome() {
		return this.nome;
	}
	@Override
	public double calcularQuantidadeTotal(int numAdultos, int numCriancas) {
	return (numAdultos*porcoesPorPessoaAdulto)+(numCriancas*porcoesPorPessoaCrianca);
	}
	
}
