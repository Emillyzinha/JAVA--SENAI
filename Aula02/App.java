import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // declarando variável
        Double peso;
        Double altura;
        Double IMC;
        Scanner x = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite o seu peso: ");
        peso  = x.nextDouble();
        System.out.println("Digite a sua altura: ");
        altura = x.nextDouble();

        // processamento
        IMC = peso/(altura*altura);

        // saída de dados
        if (IMC > 40.0) {
            System.out.printf("Seu IMC é: %.2f\nObesidade grave", IMC);
        }
        if (IMC > 30.0 && IMC < 39.9) {
            System.out.printf("Seu IMC é: %.2f\n Obesidade", IMC);
        }
        if (IMC > 25.0 && IMC < 29.9) {
            System.out.printf("Seu IMC é: &.2f\nSobrepeso", IMC);
        }
        if (IMC > 18.5 && IMC < 24.9) {
            System.out.printf("Seu IMC é: %.2f\nNormal", IMC);
        }
        if (IMC < 15.5) {
            System.out.printf("Seu IMC é: %.2f\nMagreza", IMC);
        }
    }
}