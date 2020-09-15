package br.edu.univas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        int[] notas = lerNotas();
        int[] notas2 = calcularNotas(notas);
        int quantidade = calcularQuantidadeAlunos(notas2);
        System.out.println("Quantidade de alunos com nota maior ou igual a 60 é: " + quantidade);
    }

    private static int[] calcularNotas(int[] notas) {
        int[] notas2 = new int[20];
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            notas2[j] = notas[i];
            j++;
            if (notas[i] >= 60) {
                notas2[j] = 1;
            } else {
                notas2[j] = 0;
            }
            j++;
        }
        return notas2;
    }

    private static int calcularQuantidadeAlunos(int[] notas2) {
        int quantidade = 0;
        for (int i = 0; i < notas2.length; i++) {
            if (i % 2 == 1) {
                if (notas2[i] == 1) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    private static int[] lerNotas() {
        Scanner leitura = new Scanner(System.in);

        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = leitura.nextInt();
        }

        leitura.close();
        return notas;
    }

}
