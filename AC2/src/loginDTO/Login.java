package loginDTO;

public class Login {
    private String nome, email, senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha; 
    }
    
    public void Cadastrar(String nome, String email, String senha){
        this.email = email;
        this.senha = senha;
        this.nome = nome;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        
}


