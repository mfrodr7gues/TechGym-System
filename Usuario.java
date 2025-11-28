import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    // Atributos 
    private String nome;
    private String email;
    private String senha;
    private boolean logado;
    private List<FichaTreino> fichasTreino;
    private List<AvaliacaoFisica> avaliacoes;

    // Construtor 
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logado = false;
        this.fichasTreino = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Acesso às privates usando getters e setters
    public String getNome() { 
        return nome; 
    }

    public String getEmail() { 
        return email; 
    }

    public String getSenha() { 
        return senha; 
    }

    public boolean isLogado() { 
        return logado; 
    }

    public List<FichaTreino> getFichasTreino() { 
        return fichasTreino; 
    }

    public List<AvaliacaoFisica> getAvaliacoes() { 
        return avaliacoes; 
    }

    protected void setLogado(boolean logado) { 
        this.logado = logado; 
    }

    // Métodos abstratos da classe mãe
    public abstract void realizarLogin(String email, String senha);

    public abstract void realizarLogout();

    public abstract void cancelarMatricula();

    public abstract void criarFichaTreino(String nome, String exercicios);

    public abstract void editarFichaTreino(int id, String novosExercicios);

    public abstract void salvarFichaTreino(int id);

    public abstract void acessarFichaTreino(int id);

    public abstract void criarAvaliacaoFisica(double peso, double altura);

    public abstract void editarAvaliacaoFisica(int id, double novoPeso, double novaAltura);

    public abstract void salvarAvaliacaoFisica(int id);

    public abstract void acessarAvaliacaoFisica(int id);
}