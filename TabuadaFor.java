import java.util.Scanner;  
public class TabuadaFor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, i, r;
		
		System.out.println("Digite um número de 1 a 10 para saber sua tabuada: ");
		num = leia.nextInt();
		leia.close();
		
		System.out.println("A Tabuada do número " + num+ " é:");
		for(i = 0; i < 11; i++) {
			r = i * num;
			System.out.println(num + " x " +i+ " = " + r);
		}
		
	}

}



