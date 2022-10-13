package Veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        Scanner op1 = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    ----------- Veiculos ---------
                    [0] - Sair
                    [1] - Adicionar
                    [2] - Listar
                    [3] - Escolher
                    """);
            System.out.print("Escolha uma opção: ");
            int opcaoVeiculo = op1.nextInt();
            if (opcaoVeiculo == 0) {
                break;
            } else if (opcaoVeiculo == 1) {
                v.adicionarVeiculo();
            }

        }
    }
}