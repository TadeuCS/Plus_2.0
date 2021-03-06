/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

/**
 *
 * @author Tadeu
 */
public class Frm_Transportador extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Transportador
     */
    public Frm_Transportador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_rodape = new javax.swing.JPanel();
        btn_inclusao = new javax.swing.JButton();
        btn_alteracao = new javax.swing.JButton();
        btn_exclusao = new javax.swing.JButton();
        txt_operacao = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btn_visualisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Transportador");
        setResizable(false);

        pnl_rodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_inclusao.setText("Inclusão");
        btn_inclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inclusaoActionPerformed(evt);
            }
        });

        btn_alteracao.setText("Alteração");
        btn_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alteracaoActionPerformed(evt);
            }
        });

        btn_exclusao.setText("Exclusão");
        btn_exclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclusaoActionPerformed(evt);
            }
        });

        txt_operacao.setEditable(false);
        txt_operacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_operacaoKeyReleased(evt);
            }
        });

        jLabel32.setText("Nome:");

        btn_visualisar.setText("Visualisar");
        btn_visualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_rodapeLayout = new javax.swing.GroupLayout(pnl_rodape);
        pnl_rodape.setLayout(pnl_rodapeLayout);
        pnl_rodapeLayout.setHorizontalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_inclusao)
                .addGap(18, 18, 18)
                .addComponent(btn_alteracao)
                .addGap(18, 18, 18)
                .addComponent(btn_exclusao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_visualisar)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_operacao)
                .addContainerGap())
        );
        pnl_rodapeLayout.setVerticalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_exclusao)
                        .addComponent(txt_operacao)
                        .addComponent(jLabel32)
                        .addComponent(btn_visualisar))
                    .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_inclusao)
                        .addComponent(btn_alteracao)))
                .addGap(357, 357, 357))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODTRASPORTADOR", "NOME", "CPF", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addComponent(pnl_rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_rodape, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inclusaoActionPerformed
        Frm_Transportador_util f = new Frm_Transportador_util();
        f.setTitle("Cadastro de Transportador");
        f.setVisible(true);
    }//GEN-LAST:event_btn_inclusaoActionPerformed

    private void txt_operacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_operacaoKeyReleased
        System.out.println("implementar o metodo de consulta");
    }//GEN-LAST:event_txt_operacaoKeyReleased

    private void btn_visualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualisarActionPerformed
        System.out.println("implementar o metodo de visualizar");
    }//GEN-LAST:event_btn_visualisarActionPerformed

    private void btn_exclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclusaoActionPerformed
        System.out.println("implementar o metodo de excluir");
    }//GEN-LAST:event_btn_exclusaoActionPerformed

    private void btn_alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alteracaoActionPerformed
        Frm_Transportador_util f = new Frm_Transportador_util();
        f.setTitle("Alteração de Transportador");
        f.setVisible(true);
    }//GEN-LAST:event_btn_alteracaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Transportador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Transportador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Transportador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Transportador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Transportador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alteracao;
    private javax.swing.JButton btn_exclusao;
    private javax.swing.JButton btn_inclusao;
    private javax.swing.JButton btn_visualisar;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_rodape;
    private javax.swing.JTextField txt_operacao;
    // End of variables declaration//GEN-END:variables
}
