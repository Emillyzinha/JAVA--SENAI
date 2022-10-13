package Veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
    Scanner op1 = new Scanner(System.in);
    ArrayList<String> carroModelo = new ArrayList<>();
    ArrayList<Double> carroConsumo = new ArrayList<>();
    ArrayList<Double> carroTanque = new ArrayList<>();
    ArrayList<Integer> carroVelMax = new ArrayList<>();

    ArrayList<String> motoModelo = new ArrayList<>();
    ArrayList<Double> motoConsumo = new ArrayList<>();
    ArrayList<Double> motoTanque = new ArrayList<>();
    ArrayList<Integer> motoVelMax = new ArrayList<>();

    ArrayList<String> outroNomeVeiculo = new ArrayList<>();
    ArrayList<String> outroModelo = new ArrayList<>();
    ArrayList<Double> outroConsumo = new ArrayList<>();
    ArrayList<Double> outroTanque = new ArrayList<>();
    ArrayList<Integer> outroVelMax = new ArrayList<>();

    String modelo, nomeVeiculo;

    int velMax;
    double consumo, tanque;
    public Veiculo(){
        this.velMax=0;
        this.consumo=0;
        this.tanque=0;
        this.modelo="";
        this.nomeVeiculo="";
    }

    void adicionarVeiculo(){
        while (true) {
            System.out.print("""
                    ----------- Veiculos ---------
                    [0] - Sair
                    [1] - Carro
                    [2] - Moto
                    [3] - Outro
                    """);
            System.out.print("Escolha uma opção: ");
            int opcaoAdicionar = op1.nextInt();
//            if(opcaoAdicionar != 0 || opcaoAdicionar != 1 || opcaoAdicionar != 2 || opcaoAdicionar != 3){
//
//            }
            if(opcaoAdicionar == 0){
                break;
            } else if (opcaoAdicionar==1) {
                op1.nextLine();
                carro();
            }else if (opcaoAdicionar == 2){
                op1.nextLine();
                moto();
            } else if (opcaoAdicionar == 3) {
                op1.nextLine();
                outro();
            }
        }
    }
    void detalheVeiculo(){
        System.out.print("Modelo: ");
        modelo = op1.nextLine();

        System.out.print("Consumo: ");
        consumo = op1.nextDouble();

        System.out.print("Tanque: ");
        tanque = op1.nextDouble();

        System.out.print("Velocidade máxima: ");
        velMax = op1.nextInt();
    }
    void ultimoPrint(){
        System.out.print("\nModelo: "+ modelo);
        System.out.print("\nConsumo: "+ consumo);
        System.out.print("\nTanque: "+ tanque);
        System.out.print("\nVelocidade Max: "+ velMax +"\n\n");
    }

    void carro(){
        detalheVeiculo();
        carroModelo.add(modelo);
        carroConsumo.add(consumo);
        carroTanque.add(tanque);
        carroVelMax.add(velMax);
        ultimoPrint();
    }

    void moto(){
        detalheVeiculo();
        motoModelo.add(modelo);
        motoConsumo.add(consumo);
        motoTanque.add(tanque);
        motoVelMax.add(velMax);
        ultimoPrint();
    }

    void outro(){
        System.out.println("Digite o modelo de veículo deseja cadastrar: ");
        nomeVeiculo = op1.nextLine();
        outroNomeVeiculo.add(nomeVeiculo);
        detalheVeiculo();
        outroModelo.add(modelo);
        outroConsumo.add(consumo);
        outroTanque.add(tanque);
        outroVelMax.add(velMax);
    }

    void listar(){
        while (true) {
            System.out.print("""
                    ----------- Listagem dos veículos ---------
                    [0] - Sair
                    [1] - Carro
                    [2] - Moto
                    [3] - Outro
                    """);
            int opcao = op1.nextInt();
            if (opcao == 0){
                break;
            }else if (opcao == 1){
                for (int i = 0; )
            }
        }
    }
}