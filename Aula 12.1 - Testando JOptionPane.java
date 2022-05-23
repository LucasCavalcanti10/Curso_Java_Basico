package testejoptions;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TesteJOptions {

    public static void main(String[] args) {
        
        int n,total=0,par=0,impar=0,media,maiscem=0,soma=0;
        
        do {
            
        n = Integer.parseInt(JOptionPane.showInputDialog("<html>Digite um valor. Digite 0 para canselar</html>"));
        total +=1;
        soma +=n;
        
            if (n>100) {
                maiscem += 1;
                }
            if (n%2==0) {
                par += 1;
                } else {
                impar +=1;    
            }
            
        } while (n!=0);
        
        media = soma/total;
        
        JOptionPane.showMessageDialog(null,"<html> Resultado<br>"
                + "-----------<br>" +
                "Total de valores " + total + 
                " <br>Total de impar " + impar +
                "<br> Total de Pares " + par + 
                "<br> Acima de cem " + maiscem + 
                "<br> Média dos valores " + media);
    
    
    }
}
