public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    protected final boolean isAdm;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario(boolean isAdm) {
        this.isAdm = isAdm;
    }
    public boolean isAdm() {
        return isAdm;
    }

    public String login() {
        return "Login realizado";
    }
    public String logoff(){
        return "Finalizando sessão...";
    }
    public String alterarDados(String nome, String email){
        setNome(nome);
        setEmail(email);
        return "Dados alterados com sucesso";
    }
    public String alterarSenha(String senha){
        setSenha(senha);
        return "Senha alterada com sucesso";
    }
}
