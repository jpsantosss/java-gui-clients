package gui_trabalho;

public class PessoaDlg extends javax.swing.JDialog {

    static boolean executar(OperacaoCadastro operacaoCadastro, Pessoa pessoa) {
        PessoaDlg pessoaDlg = new PessoaDlg(null,operacaoCadastro, pessoa);
        pessoaDlg.setLocationRelativeTo(null);
        pessoaDlg.setVisible(true);
        return pessoaDlg.operacaoConfirmada();
    }

    private OperacaoCadastro operacaoCadastro;
    private Pessoa pessoa;
    private boolean confirmado;
    
    
    public PessoaDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PessoaDlg(java.awt.Frame parent, OperacaoCadastro operacaoCadastro, Pessoa pessoa){
        super(parent, true);
        
        confirmado = false;
        this.operacaoCadastro = operacaoCadastro;
        this.pessoa = pessoa;
        
        initComponents();
        
        if(operacaoCadastro == operacaoCadastro.alterar|| operacaoCadastro == OperacaoCadastro.consultar){
            edNome.setText(pessoa.obterNome());
            edTelefone.setText(pessoa.obterTelefone());
            edEmail.setText(pessoa.obterEmail());
            edLogradouro.setText(pessoa.obterLogradouro());
            edNumero.setText(pessoa.obterNumero());
            edComplemento.setText(pessoa.obterComplemento());
            edBairro.setText(pessoa.obterBairro());
            edCidade.setText(pessoa.obterCidade());
            edEstado.setText(pessoa.obterEstado());
            edCep.setText(pessoa.obterCep());
        }
        buCancelar.setVisible(operacaoCadastro != OperacaoCadastro.consultar);
        edNome.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edTelefone.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edEmail.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edLogradouro.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edNumero.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edComplemento.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edBairro.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edCidade.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edEstado.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
        edCep.setEnabled(operacaoCadastro != OperacaoCadastro.consultar);
    }
    
    public boolean operacaoConfirmada(){
        return confirmado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edCep1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buOk = new javax.swing.JButton();
        buCancelar = new javax.swing.JButton();
        edNome = new javax.swing.JTextField();
        edTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        edLogradouro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edNumero = new javax.swing.JTextField();
        edComplemento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edBairro = new javax.swing.JTextField();
        edEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edCep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setText("CEP:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buOk.setText("Ok");
        buOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buOkActionPerformed(evt);
            }
        });

        buCancelar.setText("Cancelar");
        buCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCancelarActionPerformed(evt);
            }
        });

        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        edEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEmailActionPerformed(evt);
            }
        });

        jLabel3.setText("Email:");

        jLabel4.setText("Logradouro:");

        edNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero:");

        jLabel6.setText("Complemento:");

        edBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBairroActionPerformed(evt);
            }
        });

        jLabel7.setText("Bairro:");

        jLabel8.setText("Estado:");

        jLabel9.setText("CEP:");

        edCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Cidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(edCep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edComplemento)
                            .addComponent(edNumero)
                            .addComponent(edBairro)
                            .addComponent(edEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(buOk))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(buCancelar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed

    private void buOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buOkActionPerformed
        if(operacaoCadastro != OperacaoCadastro.consultar){
            
            pessoa.atualizarNome(edNome.getText());
            pessoa.atualizarTelefone(edTelefone.getText());
            pessoa.atualizarEmail(edEmail.getText());
            pessoa.atualizarLogradouro(edLogradouro.getText());
            pessoa.atualizarNumero(edNumero.getText());
            pessoa.atualizarComplemento(edComplemento.getText());
            pessoa.atualizarBairro(edBairro.getText());
            pessoa.atualizarCidade(edCidade.getText());
            pessoa.atualizarEstado(edEstado.getText());
            pessoa.atualizarCep(edCep.getText());
            
            
            confirmado = true;
        }
        dispose();
    }//GEN-LAST:event_buOkActionPerformed

    private void buCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buCancelarActionPerformed

    private void edEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEmailActionPerformed

    private void edNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNumeroActionPerformed

    private void edBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edBairroActionPerformed

    private void edCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCidadeActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PessoaDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PessoaDlg dialog = new PessoaDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buCancelar;
    private javax.swing.JButton buOk;
    private javax.swing.JTextField edBairro;
    private javax.swing.JTextField edCep;
    private javax.swing.JTextField edCep1;
    private javax.swing.JTextField edCidade;
    private javax.swing.JTextField edComplemento;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEstado;
    private javax.swing.JTextField edLogradouro;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumero;
    private javax.swing.JTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
