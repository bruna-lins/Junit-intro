package entities.Financing;

public class Program {
	
	public static void main(String[] args) {

		try {
			Financing f1 = new Financing(100000.0, 4000.0, 40);
			System.out.println("Dados do financiamento 1:");
			System.out.printf("Entrada: %.2f%n", f1.entry());
			System.out.printf("Prestação: %.2f%n", f1.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Erro no 1º financiamento: " + e.getMessage());
		}
		
		try {
			Financing f2 = new Financing(100000.0, 1999.0, 80);
			System.out.println("Dados do financiamento 2:");
			System.out.printf("Entrada: %.2f%n", f2.entry());
			System.out.printf("Prestação: %.2f%n", f2.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Erro no 2º financiamento: " + e.getMessage());
		}
	}
}
