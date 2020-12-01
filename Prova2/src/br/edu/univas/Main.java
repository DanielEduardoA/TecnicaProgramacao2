package br.edu.univas;

import java.util.Scanner;

import br.edu.univas.vo.Conta;

public class Main {

    private static Conta[] contas = new Conta[100];
    private static int i = 0;
    private static final String TIPO_DESPESA = "despesa";
    private static final String TIPO_RECEITA = "receita";

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarConta();
                break;
            case 2:
                mostrarSaldo();
                break;
            case 3:
                System.out.println("Finalizando a aplicação.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
        }
        mostrarMenu();
    }

    @SuppressWarnings("resource")
    private static void mostrarMenu() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        System.out.println("-------------------------");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Saldo");
        System.out.println("3 - Sair");
        System.out.println("-------------------------");

        int opcao = leitura.nextInt();
        executarOpcao(opcao);
    }

    private static void mostrarSaldo() {
        float receita = 0;
        float despesa = 0;
        for (int j = 0; j < contas.length; j++) {
            if (contas[j] != null && contas[j].tipo.equalsIgnoreCase(TIPO_DESPESA)) {
                despesa += contas[j].valor;
            } else if (contas[j] != null && contas[j].tipo.equalsIgnoreCase(TIPO_RECEITA)) {
                receita += contas[j].valor;
            }
        }
        float saldo = receita - despesa;
        System.out.println("O Saldo é:" + saldo);
    }

    @SuppressWarnings("resource")
    private static void cadastrarConta() {
        Scanner leitura = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Digite a descrição da conta:");
        conta.descricao = leitura.nextLine();

        System.out.println("Digite a data de vencimento da conta:");
        conta.dataVencimento = leitura.nextLine();

        System.out.println("Digite o tipo da conta:");
        conta.tipo = leitura.nextLine();
        
        System.out.println("Digite o valor da conta:");
        conta.valor = leitura.nextFloat();

        contas[i] = conta;
        i++;
    }

}
