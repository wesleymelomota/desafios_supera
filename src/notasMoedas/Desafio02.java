package notasMoedas;

import java.util.Scanner;
//NotasMoedas
public class Desafio02 {
	public static int fatores(Double valor) {
		if(valor % 2 == 0) {
			return 2;
		}
		if(valor % 3 == 0) {
			return 3;
		}
		if(valor % 5 == 0) {
			return 5;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		Double valor = entrada.nextDouble();
		entrada.close();
		
		int notas[] = {100, 50, 20, 10, 5, 2};
        double moedas[] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;//atualiza o valor total, obtendo o restante após a retirada das notas já contabilizadas
        }
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
            valor %= moeda;
        }
	}
}
