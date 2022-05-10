package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Qual foi sua nota: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
    }
    
}
