import java.util.Scanner;
public class FaixaEtaria {
    
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double faixa1 = 0, faixa2= 0, faixa3 = 0, faixa4 = 0, faixa5 = 0, porcentagem = 0, idade;
		int i; 
		
		for ( i = 1; i < 16; i = i + 1) {
			System.out.println("Digite a idade da " +i+ "° pessoa: ");
			idade = leia.nextDouble();
			
			if (idade <= 15) {
				faixa1 = faixa1 + 1;

			} else if (idade <= 30) {
				faixa2 = faixa2 + 1;

			} else if (idade <= 45) {
				faixa3 = faixa3 + 1;

			} else if (idade <= 60) {
				faixa4 = faixa4 + 1;

			} else {
				faixa5 = faixa5 + 1;
			}
			
		}
		leia.close();
		
		porcentagem = (100 * faixa1) / 15;
		System.out.println("Até 15 anos, temos o total de " +faixa1+ " pessoas. Igual a " +porcentagem+ "% do geral;");
		
		porcentagem = (100 * faixa2) / 15;
		System.out.println("De 16 a 30 anos, temos o total de " +faixa2+ " pessoas. Igual a " +porcentagem+ "% do geral;");
		
		porcentagem = (100 * faixa3) / 15;
		System.out.println("De 31 a 45 anos, temos o total de " +faixa3+ " pessoas. Igual a " +porcentagem+ "% do geral;");
		
		porcentagem = (100 * faixa4) / 15;
		System.out.println("De 46 a 60 anos, temos o total de " +faixa4+ " pessoas. Igual a " +porcentagem+ "% do geral;");
		
		porcentagem = (100 * faixa5) / 15;
		System.out.println("E acima de 61 anos, temos o total de " +faixa5+ " pessoas. Igual a " +porcentagem+ "% do geral.");
		
		System.out.println("Total de pessoas: " +(i-1)+ ".");
	}


	}


