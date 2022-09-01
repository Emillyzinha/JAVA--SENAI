import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class desafio03 {
    public static void main(String[] args) {

        // enrada de dados
        DecimalFormat dec = new DecimalFormat("#.00");

        String pergunta0 = JOptionPane.showInputDialog("Olá, o que você quer calcular?\n[1]Diâmetro\n[2]Perímetro\n[3]Área\n[4]Todos");
        Double pergunta = Double.parseDouble(pergunta0);

        String pergunta00 = JOptionPane.showInputDialog("Me diga o raio: ");
        Double raio = Double.parseDouble(pergunta00);

        // processamento de dados
        Double diametro = 2*raio;
        Double perimetro = (2*Math.PI)*raio;
        Double area = Math.PI*Math.pow(raio, 2);
        
        // saída de dados
        if (pergunta == 1) {
            JOptionPane.showMessageDialog(null,"O diâmetro é: "+dec.format(diametro));
        } 
        if (pergunta == 2) {
            JOptionPane.showMessageDialog(null,"O perímetro é: "+dec.format(perimetro));
        }
        if (pergunta == 3) {
            JOptionPane.showMessageDialog(null,"A área é: "+dec.format(area));
        }
        if (pergunta == 4) {
            JOptionPane.showMessageDialog(null,"O diâmetro é: "+dec.format(diametro));
            JOptionPane.showMessageDialog(null,"O perímetro é: "+dec.format(perimetro));
            JOptionPane.showMessageDialog(null,"A área é: "+dec.format(area));
        }
    }
}