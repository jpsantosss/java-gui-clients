package gui_trabalho;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaPessoa extends AbstractTableModel{
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_TELEFONE = 1;
    private static final int COLUNA_EMAIL = 2;
    private static final int COLUNA_LOGRADOURO = 3;
    private static final int COLUNA_NUMERO = 4;
    private static final int COLUNA_COMPLEMENTO = 5;
    private static final int COLUNA_BAIRRO = 6;
    private static final int COLUNA_CIDADE = 7;
    private static final int COLUNA_ESTADO = 8;
    private static final int COLUNA_CEP = 9;
    
    private String[] colunas = new String[]{"Nome", "Telefone", "Email", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "CEP"};
    private ArrayList<Pessoa>pessoas;
    
    
    public ModeloTabelaPessoa(){
        this.pessoas = new ArrayList<Pessoa>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public int getRowCount(){
        return pessoas.size();
    }
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    @Override
    public Object getValueAt(int row, int col){
        Pessoa pessoa = pessoas.get(row);
        switch(col){
            case COLUNA_NOME:
                return pessoa.obterNome();
            case COLUNA_TELEFONE:
                return pessoa.obterTelefone();
            case COLUNA_EMAIL:
                return pessoa.obterEmail();
            case COLUNA_LOGRADOURO:
                return pessoa.obterLogradouro();
            case COLUNA_NUMERO:
                return pessoa.obterNumero();
            case COLUNA_COMPLEMENTO:
                return pessoa.obterComplemento();
            case COLUNA_BAIRRO:
                return pessoa.obterBairro();
            case COLUNA_CIDADE:
                return pessoa.obterCidade();
            case COLUNA_ESTADO:
                return pessoa.obterEstado();
            case COLUNA_CEP:
                return pessoa.obterCep();
        }
        return "";
    }
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Pessoa pessoa = pessoas.get(row);
        switch(column){
            case COLUNA_NOME:
                pessoa.atualizarNome(aValue.toString());
                break;
            case COLUNA_TELEFONE:
                pessoa.atualizarTelefone(aValue.toString());
                break;
            case COLUNA_EMAIL:
                pessoa.atualizarEmail(aValue.toString());
                break;
            case COLUNA_LOGRADOURO:
                pessoa.atualizarLogradouro(aValue.toString());
                break;
            case COLUNA_NUMERO:
                pessoa.atualizarNumero(aValue.toString());
                break;
            case COLUNA_COMPLEMENTO:
                pessoa.atualizarComplemento(aValue.toString());
                break;
            case COLUNA_BAIRRO:
                pessoa.atualizarBairro(aValue.toString());
                break;
            case COLUNA_CIDADE:
                pessoa.atualizarCidade(aValue.toString());
                break;
            case COLUNA_ESTADO:
                pessoa.atualizarEstado(aValue.toString());
                break;
            case COLUNA_CEP:
                pessoa.atualizarCep(aValue.toString());
                break;
        }
    }
    
    public Pessoa obterPessoa(int indice){
        return pessoas.get(indice);
    }
    
    public void incluirPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo,ultimo);
    }
    public void atualizarPessoa(int indice, Pessoa pessoa){
        pessoas.set(indice, pessoa);
        fireTableRowsUpdated(indice,indice);
    }
    public void excluirPessoa(int indice){
        pessoas.remove(indice);
        fireTableRowsDeleted(indice,indice);
    }
}

