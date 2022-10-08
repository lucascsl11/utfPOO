package d3f3ct;
/*
 * Pacote criado por diversão para um RPG de mesa onde meu personagem é um robô. 
 * Achei divertido criar em forma de POO. Atualizações com novos 
 * métodos e conhecimentos devem ocorrer logo.
 */

/*
 * Versão 1.0
 * Implementação de encapsulamento, getters e construtores (completos e incompletos)
 */
public class Defect {
	public static void main(String args[]) {
		//INVENTÁRIO DE ITENS
        Item tornozeleira = new Item("+4 Max Mana");
        Item espadaOmni = new Item("+10 a todo dano", "+5 Max EN");
        Item marcaYvelord = new Item("+4 EN/turno");
        Item botasFixas = new Item("+5 Max EN");
		
		//INFORMAÇÕES
		Lore motivacaoRelocacao = new Lore("Era uma 'falha' em meu universo de origem");
		
		Lore conhecidos = new Lore(
				"Yvelord (CPU)"
				+ "Bruna (Antiga Gerenciadora de Tarefas)"
				+ "Ganon (Benchmarker)"
				+ "Vivian (DMA)"
				+ "CallHeaven (Gerenciador Atual de Tarefas)"
				+ "Miller, Luck, Kadi, Schariac"
				+ "Kurayama, Lumya, Skáphe, Azazel"
				+ "Josephys, Luci, Rebecca (Outros afetados pela calamidade)");
		
		Lore calamidades = new Lore(
				"Desastres recorrentes em outros universos"
				+ "que necessitam de resolução"
				+ "e foram criados por Adão e Eva."
				+ "Capazes de corromper indivíduos, locais, e até conceitos como a Mana.");
	}
}
