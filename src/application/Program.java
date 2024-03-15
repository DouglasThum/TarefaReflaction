package application;

public class Program {
	
	public static void main(String[] args) {
		
		Tabela tabela = new Tabela();
			
		TabelaAnnotation annotation = tabela.getClass().getAnnotation(TabelaAnnotation.class);
		System.out.println("Nome da anotação: " + annotation.value());
	}
}
