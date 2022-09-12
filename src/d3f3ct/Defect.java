package d3f3ct;

public class Defect {
	public static void main(String args[]) {
		//INVENTÁRIO DE ITENS
			Item item1 = new Item();
			Item item2 = new Item();
			
			item1.nome = "Dispositivo Tornozeleira";
			item1.efeito1 = "+4 Mana";
			
			item2.nome = "Espada OMNI";
			item2.efeito1 = "+10 a todo dano";
			item2.efeito2 = "+5 Energia";
		
		//INFORMAÇÕES
			Lore parte1 = new Lore();
			Lore parte2 = new Lore();
			Lore parte3 = new Lore();
			
			parte1.titulo = "Motivação de Relocação";
			parte1.definicao = "Era uma 'falha' em meu universo de origem";
			
			parte2.titulo = "Novos Indivíduos Conhecidos";
			parte2.definicao = "Yvelord (CPU), Bruna (Gerenciadora de Tarefas), Ganon (Benchmarker)";
			parte2.definicao2 = "Miller, Luck, Kadi, Schariac, Kurayama, Lumya, Skáphe, Azazel, Josephus, Luci, Rebecca (Outros Processos)";
			
			parte3.titulo = "Calamidades";
			parte3.definicao = "Desastres recorrentes em outros universos - necessitam de resolução - criados por Adão e Eva";
			parte3.definicao2 = "Capazes de corromper indivíduos, locais, e até conceitos como a Mana";
	}
}
