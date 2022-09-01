import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] paises = {"Brasil", "Índia", "Rússia", "China"};

        for(int i= 0; i < paises.length; i++){
        System.out.println(paises[i]);
        }

    int[] valores = {1, 8, 7, 6, 2, 4, 9, 0, 3, 5};
    for(int j = 0; j < valores.length; j++){
        System.out.print(valores[j]);
    }
    System.out.println("\n"+Arrays.toString(valores));
    }
}
// imprimir os 4 paises usando for e 1 sout
// conjunto de valores, sequencia organizada