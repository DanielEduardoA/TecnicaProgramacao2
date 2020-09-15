package br.edu.univas;

import java.util.Scanner;

public class InversaoString {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Informe uma palavra:\n");
        String palavra = leitura.next();
        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("Palavra invertida: " +palavraInvertida);
        leitura.close();
    }

    private static String inverterPalavra(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        return palavraInvertida;
    }

}
