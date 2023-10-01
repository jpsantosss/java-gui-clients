package gui_trabalho;

import javax.swing.JOptionPane;

public class CadastroPessoaDlg extends javax.swing.JDialog {

    private ModeloTabelaPessoa modeloPessoa;
    
    public CadastroPessoaDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloPessoa = new ModeloTabelaPessoa();
        tabPessoa.setModel(modeloPessoa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPessoa = new javax.swing.JTable();
        buIncluir = new javax.swing.JButton();
        buAlterar = new javax.swing.JButton();
        buExcluir = new javax.swing.JButton();
        buConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(tabPessoa);

        buIncluir.setText("Incluir");
        buIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buIncluirActionPerformed(evt);
            }
        });

        buAlterar.setText("Alterar");
        buAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buAlterarActionPerformed(evt);
            }
        });

        buExcluir.setText("Excluir");
        buExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buExcluirActionPerformed(evt);
            }
        });

        buConsultar.setText("Consultar");
        buConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("LISTA DE CLIENTES CADASTRADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(buAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buIncluir)
                        .addGap(35, 35, 35)
                        .addComponent(buAlterar)
                        .addGap(35, 35, 35)
                        .addComponent(buExcluir)
                        .addGap(35, 35, 35)
                        .addComponent(buConsultar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buIncluirActionPerformed
        Pessoa pessoa = new Pessoa();
        if(PessoaDlg.executar(OperacaoCadastro.incluir, pessoa)){
            modeloPessoa.incluirPessoa(pessoa);
        }
    }//GEN-LAST:event_buIncluirActionPerformed

    private void buAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buAlterarActionPerformed
        int indice = tabPessoa.getSelectedRow();
        if(indice >= 0){
            Pessoa pessoa = modeloPessoa.obterPessoa(indice);
            if(PessoaDlg.executar(OperacaoCadastro.alterar, pessoa)){
                modeloPessoa.atualizarPessoa(indice, pessoa);
            }
        }
    }//GEN-LAST:event_buAlterarActionPerformed

    private void buExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buExcluirActionPerformed
        int indice = tabPessoa.getSelectedRow();
        if(indice >= 0){
            modeloPessoa.excluirPessoa(indice);
        }
    }//GEN-LAST:event_buExcluirActionPerformed

    private void buConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buConsultarActionPerformed
        int indice = tabPessoa.getSelectedRow();
        if(indice >= 0){
            Pessoa pessoa = modeloPessoa.obterPessoa(indice);
            PessoaDlg.executar(OperacaoCadastro.consultar, pessoa);
        }
    }//GEN-LAST:event_buConsultarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroPessoaDlg dialog = new CadastroPessoaDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buAlterar;
    private javax.swing.JButton buConsultar;
    private javax.swing.JButton buExcluir;
    private javax.swing.JButton buIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPessoa;
    // End of variables declaration//GEN-END:variables
}
