import java.text.DecimalFormat;
import javax.swing.*;

public class IMC_SwitchCase {
    public static void main(String[] args) {
        int x = 10;

        switch (x) {
            case 0:
                JOptionPane.showMessageDialog(null, "Sei lá");
            case 10:
                JOptionPane.showMessageDialog(null, "sei lá 2");
            default:
                break;
        }
    }
}