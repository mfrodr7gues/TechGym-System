import java.util.Date;

// Classe filha
public class Aluno extends Usuario {

    // Atributos
    private int idAluno;
    private String cpf;
    private Date dataNascimento;
    private Matricula matricula;

    public Aluno(String nome, String email, String senha, int idAluno, String cpf, Date dataNascimento) {

        // Atributos herdados da classe mãe
        super(nome, email, senha);

        this.idAluno = idAluno;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = new Matricula(this);
    }

    // Acesso às privates usando getters e setters
    public int getIdAluno() {
        return idAluno;
    }

    public String getCpf() { 
        return cpf; 
    }

    public Date getDataNascimento() { 
        return dataNascimento; 
    }

    public Matricula getMatricula() { 
        return matricula; 
    }

    // Métodos abstratos implementados da classe mãe
    @Override
    public void realizarLogin(String email, String senha) {
        if (getEmail().equals(email) && getSenha().equals(senha)) {
            setLogado(true);
            System.out.println("Login realizado: " + getNome());
        } else {
            System.out.println("Login falhou");
        }
    }

    @Override
    public void realizarLogout() {
        setLogado(false);
        System.out.println("Logout: " + getNome());
    }

    @Override
    public void cancelarMatricula() {
        matricula.cancelar();
        System.out.println("Matricula cancelada: " + getNome());
    }

    @Override
    public void criarFichaTreino(String nome, String exercicios) {
        FichaTreino novaFicha = new FichaTreino(exercicios);
        getFichasTreino().add(novaFicha);
        System.out.println("Ficha criada: " + novaFicha.getIdFichaDeExercicios());
    }

    @Override
    public void editarFichaTreino(int id, String novosExercicios) {
        FichaTreino ficha = buscarFichaPorId(id);
        if (ficha != null) {
            ficha.editarFichaDeExercicios(novosExercicios);
        }
    }

    @Override
    public void salvarFichaTreino(int id) {
        FichaTreino ficha = buscarFichaPorId(id);
        if (ficha != null) {
            ficha.salvarFichaDeExercicios();
        }
    }

    @Override
    public void acessarFichaTreino(int id) {
        FichaTreino ficha = buscarFichaPorId(id);
        if (ficha != null) {
            ficha.accessarFichaDeExercicios();
        }
    }

    @Override
    public void criarAvaliacaoFisica(double peso, double altura) {
        AvaliacaoFisica novaAvaliacao = new AvaliacaoFisica(peso, altura);
        getAvaliacoes().add(novaAvaliacao);
        System.out.println("Avaliacao criada: " + novaAvaliacao.getIdAvaliacaoFisica());
    }

    @Override
    public void editarAvaliacaoFisica(int id, double novoPeso, double novaAltura) {
        AvaliacaoFisica avaliacao = buscarAvaliacaoPorId(id);
        if (avaliacao != null) {
            avaliacao.editarAvaliacaoFisica(novoPeso, novaAltura);
        }
    }

    @Override
    public void salvarAvaliacaoFisica (int id) {
        AvaliacaoFisica avaliacao = buscarAvaliacaoPorId(id);
        if (avaliacao != null) {
            avaliacao.salvarAvaliacaoFisica();
        }
    }

    @Override
    public void acessarAvaliacaoFisica (int id) {
        AvaliacaoFisica avaliacao = buscarAvaliacaoPorId(id);
        if (avaliacao != null) {
            avaliacao.acessarAvaliacaoFisica();
        }
    }

    // Métodos específicos da classe Aluno
    private FichaTreino buscarFichaPorId (int id) {
        for (FichaTreino ficha : getFichasTreino()) {
            if (ficha.getIdFichaDeExercicios() == id) {
                return ficha;
            }
        }
        return null;
    }

    private AvaliacaoFisica buscarAvaliacaoPorId (int id) {
        for (AvaliacaoFisica avaliacao : getAvaliacoes()) {
            if (avaliacao.getIdAvaliacaoFisica() == id) {
                return avaliacao;
            }
        }
        return null;
    }

    public void realizarMatricula() {
        System.out.println("Notificacao enviada para: " + getNome());
    }
    
    public void escolherPlano (Plano plano) {
        matricula.setPlano(plano);
        System.out.println("Plano selecionado: " + plano.getNomePlano());
    }
    
    public void realizarPagamento (double valor) {
        matricula.realizarPagamento(valor);
    }
}