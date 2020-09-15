package br.edu.univas;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Informe uma palavra:\n");
        String palavra = leitura.next();
        boolean palavraPalindrome = verificarPalindrome(palavra);
        if (palavraPalindrome) {
            System.out.println(palavra + " é palindrome");
        } else {
            System.out.println(palavra + " não é palindrome");
        }
        leitura.close();
    }

    private static boolean verificarPalindrome(String palavra) {
        if (palavra.length() == 0 || palavra.length() == 1) {
            return true;
        }

        if (palavra.charAt(0) == palavra.charAt(palavra.length() - 1)) {
            return verificarPalindrome(palavra.substring(1, palavra.length() - 1));
        }

        return false;
    }

}
