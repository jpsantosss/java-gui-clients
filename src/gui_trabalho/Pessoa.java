package gui_trabalho;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
    public String obterNome(){
        return nome;
    }
    public String obterTelefone(){
        return telefone;
    }
    public String obterEmail(){
        return email;
    }
    public String obterLogradouro(){
        return logradouro;
    }
    public String obterNumero(){
        return numero;
    }
    public String obterComplemento(){
        return complemento;
    }
    public String obterBairro(){
        return bairro;
    }
    public String obterCidade(){
        return cidade;
    }
    public String obterEstado(){
        return estado;
    }
    public String obterCep(){
        return cep;
    }
    
    public void atualizarNome(String nome){
        this.nome = nome;
    }
    public void atualizarTelefone(String telefone){
        this.telefone = telefone;
    }
    public void atualizarEmail(String email){
        this.email = email;
    }
    public void atualizarLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public void atualizarNumero(String numero){
        this.numero = numero;
    }
    public void atualizarComplemento(String complemento){
        this.complemento = complemento;
    }
    public void atualizarBairro(String bairro){
        this.bairro = bairro;
    }
    public void atualizarCidade(String cidade){
        this.cidade = cidade;
    }
    public void atualizarEstado(String estado){
        this.estado = estado;
    }
        public void atualizarCep(String cep){
        this.cep = cep;
    }
}
