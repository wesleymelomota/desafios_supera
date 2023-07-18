package ordenarImparesPares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio01 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayImpares = new ArrayList<>();
		ArrayList<Integer> arrayPares = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de valores que você quer inserir: ");
		int quantidade = scanner.nextInt();
		
		for(int i =1; i <= quantidade; i++) {
			System.out.println("Digite o valor " + i + ":");
			int valor = scanner.nextInt();
			if(valor % 2 == 0) {
				arrayPares.add(valor);
			}else {
				arrayImpares.add(valor);
			}
		}
		scanner.close();
		
		Collections.sort(arrayPares);
		for(int numero : arrayPares) {
			System.out.println(numero);
		}
		
		Collections.sort(arrayImpares);
		Collections.reverse( arrayImpares);
		for(int numero : arrayImpares) {
			System.out.println(numero);
		}
		
	}
}
