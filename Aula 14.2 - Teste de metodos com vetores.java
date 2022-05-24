package cursoemvideo.com;
import javax.swing.DefaultListModel;

/**
 *
 * @author lucas
 */
public class testeVetor4 extends javax.swing.JFrame {
    
    int vetor [] = new int [5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
    
   
    public testeVetor4() {
        initComponents();
        for (int c=0 ; c < vetor.length;c++) {
            lista.addElement(vetor[c]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoScroll = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoPainel = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        infoSelecionado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        infoPainel.setModel(lista);
        infoPainel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoPainelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(infoPainel);

        jLabel1.setText("vetor");

        infoSelecionado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdenar)
                    .addComponent(btnRemover)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnAdicionar)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(infoSelecionado)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(infoSelecionado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar))
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(27, 27, 27)
                        .addComponent(btnOrdenar)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        vetor[selecionado] = (Integer.parseInt(infoScroll.getValue().toString()));
        lista.removeAllElements();
        for (int c=0 ; c < vetor.length;c++) {
            lista.addElement(vetor[c]);
        }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void infoPainelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPainelMouseClicked

        selecionado = infoPainel.getSelectedIndex();
        infoSelecionado.setText("[" + selecionado);
    }//GEN-LAST:event_infoPainelMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        vetor[selecionado] = 0;
        lista.removeAllElements();
        for (int c=0 ; c < vetor.length;c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        Arrays.sort(vetor);
        lista.removeAllElements();
        for (int c=0 ; c < vetor.length;c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testeVetor4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JList<String> infoPainel;
    private javax.swing.JSpinner infoScroll;
    private javax.swing.JLabel infoSelecionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
