package AtividadeExtra;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float salario, abono, salarionovo;
		System.out.println("Digite seu salario");
		
		salario= leia.nextFloat();
		System.out.println("Digite o abono");
		
		abono= leia.nextFloat();
		salarionovo= salario+abono;
		System.out.println("O salario novo é" +salarionovo);
		
		
		

	}

}
