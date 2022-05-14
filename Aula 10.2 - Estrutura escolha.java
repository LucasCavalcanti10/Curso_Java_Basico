package estruturaescolha;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class EstruturaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        
        
            System.out.print("Quantas pernas tem");
            int pernas = tec.nextInt();
            String tipo;
            
            switch (pernas) {
                case 1:
                    tipo = "saci";
                    break;
                case 2:
                    tipo = "bipede";
                    break;
                case 4:
                    tipo = "quadrupte";
                    break;
                case 6:
                    tipo = "aranha";
                    break;
                default:
                    tipo = "et";
                                                                                            
            }
            
            System.out.print(tipo);
                    
                    
            
        
        
        
    }
    
}
