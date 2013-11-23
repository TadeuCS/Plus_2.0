/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Util.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Util.ConfigProperties;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Suporte4
 */
public class Frm_Produto extends javax.swing.JFrame {
    Conexao conexao= new Conexao();
    Connection con=conexao.getCon();
    Statement st= conexao.getSt();
    ResultSet rs= conexao.getRs();
    
    DefaultTableModel model;
    ConfigProperties prop;

    public Frm_Produto() {
        initComponents();
        prop = new ConfigProperties();
        model = (DefaultTableModel) tb_produto.getModel();
        try {
            listaProdutos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    

    public void listaProdutos() {
        try {
            rs = st.executeQuery(prop.ler("findAllProdutos", "queries.properties"));
            while (rs.next()) {
                String[] linha = new String[]{rs.getString("CODPROD"), rs.getString("DESCRICAO"), rs.getString("REFERENCIA"), rs.getString("DISPONIVEL")};
                model.addRow(linha);
            }
        } catch (NullPointerException e) {
            System.out.println("Lista Vazia");
        } catch (SQLException ex) {
            System.out.println("Erro no Sql");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produto = new javax.swing.JTable();
        pnl_botoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_visualisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_consulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produto");

        pnl_tabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRICAO", "REFERENCIA", "DISPONIVEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_produto);
        if (tb_produto.getColumnModel().getColumnCount() > 0) {
            tb_produto.getColumnModel().getColumn(0).setMinWidth(100);
            tb_produto.getColumnModel().getColumn(0).setPreferredWidth(100);
            tb_produto.getColumnModel().getColumn(0).setMaxWidth(100);
            tb_produto.getColumnModel().getColumn(2).setMinWidth(150);
            tb_produto.getColumnModel().getColumn(2).setPreferredWidth(150);
            tb_produto.getColumnModel().getColumn(2).setMaxWidth(150);
            tb_produto.getColumnModel().getColumn(3).setMinWidth(100);
            tb_produto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_produto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout pnl_tabelaLayout = new javax.swing.GroupLayout(pnl_tabela);
        pnl_tabela.setLayout(pnl_tabelaLayout);
        pnl_tabelaLayout.setHorizontalGroup(
            pnl_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pnl_tabelaLayout.setVerticalGroup(
            pnl_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pnl_botoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        btn_visualisar.setText("Visualisar");
        btn_visualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visualisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição:");

        txt_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_consultaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_visualisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_apagar)
                    .addComponent(btn_visualisar)
                    .addComponent(jLabel1)
                    .addComponent(txt_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        novo();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        alterar();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        apagar();
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void txt_consultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_consultaKeyReleased
        findByDescricao();
    }//GEN-LAST:event_txt_consultaKeyReleased

    private void btn_visualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visualisarActionPerformed
        visualisa();
    }//GEN-LAST:event_btn_visualisarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_visualisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_tabela;
    private javax.swing.JTable tb_produto;
    private javax.swing.JTextField txt_consulta;
    // End of variables declaration//GEN-END:variables

    private void novo() {
        Frm_Produto_Util frm = new Frm_Produto_Util();
        frm.setTitle("Cadastro");
        frm.setVisible(true);
    }

    private void alterar() {
        System.out.println("altera o produto selecionado na tabela");
    }

    private void apagar() {
        System.out.println("apagar o produto selecionado na tabela");
    }

    private void findByDescricao() {
        TableRowSorter sorter = new TableRowSorter(tb_produto.getModel());
        tb_produto.setRowSorter(sorter);
        String texto = txt_consulta.getText();
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Valor Não Encontrado!!!", "AVISO - Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void visualisa() {
        System.out.println("visualisa produto selecionado na tela");
    }
}
