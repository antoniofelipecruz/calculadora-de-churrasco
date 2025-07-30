package calculadora_de_churrasco;
import java.util.*;
public class Churrasco {
	private List<Convidado> listaConvidados;
	private List<ItemChurrasco> listaItens;
	public Churrasco() {
		this.listaConvidados = new ArrayList<>();
		this.listaItens = new ArrayList<>();
		
	}
	public void adicionarConvidado(Convidado convidado) {
		this.listaConvidados.add(convidado);
		
	}
	public void adicionarItem(ItemChurrasco item) {
		this.listaItens.add(item);
	}
	public int calcularTotalAdultos() {
		int totalAdultos=0;
		for(Convidado c : listaConvidados) {
			if(c.ehAdulto()) {
				totalAdultos++;
			}
		}
	
		return totalAdultos;
	}
	public int calcularTotalCriancas() {
		int totalCriancas=0;
		for(Convidado c : listaConvidados) {
			if (!c.ehAdulto()) {
				totalCriancas++;
				
			}
		}
		return totalCriancas;
		
	}
	
	public Map<String,Double> gerarRelatorioChurrasco(){
		Map<String,Double> relatorio = new HashMap<>();
		int numAdultos = calcularTotalAdultos();
		int numCriancas = calcularTotalCriancas();
		System.out.println("listas");
		System.out.println("convidados:"+listaConvidados.size());
		System.out.println("Adultos"+numAdultos);
		System.out.println("Crianças" + numCriancas);
		System.out.println("fim");
		for (ItemChurrasco item : listaItens) {
			double quantidadeNecessaria = item.calcularQuantidadeTotal(numAdultos, numCriancas);
			relatorio.put(item.getNome(), quantidadeNecessaria);
			
            System.out.printf("%s: %.2f %s%n", item.getNome(), quantidadeNecessaria, getUnidadeMedida(item));			}
			System.out.println("------");
			return relatorio;
		}
		private String getUnidadeMedida(ItemChurrasco item) {
			if (item instanceof Carne) {
				return "gramas";
			}else if (item instanceof Bebida) {
				return "litros";
			
			}else if (item instanceof Acompanhamento) {
				return "unidades/porção";
			}
		return "";
	
	}
}
