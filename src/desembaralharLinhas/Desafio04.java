package desembaralharLinhas;

import java.util.Scanner;
//DesembaralharLinhas
public class Desafio04 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantidade de testes: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        for (int i = 0; i < n; i++) {
        	System.out.println(i + " Teste: ");
            String linha = scanner.nextLine();
            String decifrada = decifrarLinha(linha);
            System.out.println(decifrada);
        }

        scanner.close();
    }
	
	public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder sb = new StringBuilder();

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
