package numeroDePares;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//NumeroDePares
public class Desafio03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tamanho do array: ");
        int n = scanner.nextInt();
        System.out.println("Alvo: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("indice " + i + " - Valor: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int count = contarPares(arr, k);
        System.out.println("Existem " + count + " valores cuja diferença é igual ao valor alvo " + k + ".");
    }
	
	public static int contarPares(int[] arr, int alvo) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (set.contains(num - alvo)) {
                count++;
            }
            if (set.contains(num + alvo)) {
                count++;
            }
            set.add(num);
        }

        return count;
    }
}
