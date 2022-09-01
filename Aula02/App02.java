import java.text.DecimalFormat;
import javax.swing.*;

public class App02 {
    public static void main(String[] args) {

        // entrada de dados
        DecimalFormat dec = new DecimalFormat("#.00");

        String peso1 = JOptionPane.showInputDialog("Digite o seu peso: ");
        Double peso = Double.parseDouble(peso1);

        String altura1 = JOptionPane.showInputDialog("Digite a sua altura: ");
        Double altura = Double.parseDouble(altura1);

        // processamento de dados
        Double IMC = peso/(altura*altura);

        // saída de dados
        if (IMC > 40.0) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+dec.format(IMC)+"\nObesidade grave");
        }
        if (IMC > 30.0 && IMC < 39.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+dec.format(IMC)+"\nObesidade");
        }
        if (IMC > 25.0 && IMC < 29.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+dec.format(IMC)+"\nSobrepeso");
        }
        if (IMC > 18.5 && IMC < 24.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+dec.format(IMC)+"\nSaudável");
        }
        if (IMC < 18.5){
            JOptionPane.showMessageDialog(null, "Seu IMC é: "+dec.format(IMC)+"\nMagreza");
        }
        
    }
}