package calculadora_de_churrasco;

import java.util.Map;

public class Main {
 public static void main(String[] args) {
     Churrasco meuChurrasco = new Churrasco();

     meuChurrasco.adicionarConvidado(new Convidado("João", true));     
     meuChurrasco.adicionarConvidado(new Convidado("Maria", true));    
     meuChurrasco.adicionarConvidado(new Convidado("Pedro", false));   
     meuChurrasco.adicionarConvidado(new Convidado("Ana", true));     
     meuChurrasco.adicionarConvidado(new Convidado("Carlos", false)); 

     meuChurrasco.adicionarItem(new Carne("Picanha", 500, 200));
     meuChurrasco.adicionarItem(new Carne("Linguiça", 150, 50));

     meuChurrasco.adicionarItem(new Bebida("Cerveja", 1.5, 0));
     meuChurrasco.adicionarItem(new Bebida("Refrigerante", 0.5, 0.8));

     meuChurrasco.adicionarItem(new Acompanhamento("Pão de Alho", 2, 1));
     meuChurrasco.adicionarItem(new Acompanhamento("Farofa", 0.2, 0.1));


     Map<String, Double> resultado = meuChurrasco.gerarRelatorioChurrasco();

     System.out.println("\n--- Detalhes do Relatório (do Mapa) ---");
     for (Map.Entry<String, Double> entry : resultado.entrySet()) {
         System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
     }
 }
}