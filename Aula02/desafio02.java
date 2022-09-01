import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {

        // entrada de dados
        Scanner sca = new Scanner(System.in);

        System.out.println("Olá, o que você quer calcular?\n[1]Diâmetro\n[2]Perímetro\n[3]Área\n[4]Todos");
        Double pergunta = sca.nextDouble();

        System.out.println("Me diga o raio: ");
        Double raio = sca.nextDouble();

        // processamento de dados
        Double diametro = 2*raio;
        Double perimetro = (2*Math.PI)*raio;
        Double area = Math.PI*Math.pow(raio, 2);

        // saída de dados
        if (pergunta == 1) {
            System.out.printf("O diâmetro é: %.2f", diametro);
        }
        if (pergunta == 2) {
            System.out.printf("O perímetro é: %.2f", perimetro);
        }
        if (pergunta == 3) {
            System.out.printf("A área é: %.2f", area);
        }
        if (pergunta == 4) {
            System.out.printf("Resultado:\nDiâmetro: %.2f;\nPerímetro: %.2f;\nÁrea: %.2f.",diametro, perimetro, area);
        }
    }
}