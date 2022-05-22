package testerepeticao;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TesteRepeticao {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar? S/N");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " +s);
    }
    
}
