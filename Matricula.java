import java.util.Date;

public class Matricula {

    // Atributos
    private int idMatricula;
    private Date dataInicio;
    private Date dataFim;
    private boolean ativa;
    private boolean paga;
    private Aluno aluno;
    private Plano plano;

    // Construtor
    public Matricula (Aluno aluno) {

        this.idMatricula = (int) (Math.random() * 1000) + 1000;
        this.dataInicio = new Date();
        this.ativa = true;
        this.paga = false;
        this.aluno = aluno;
    }

    // Acesso às privates usando getters e setters
    public int getIdNotifolia() { 
        return idMatricula; 
    }

    public Date getDataInicio() { 
        return dataInicio; 
    }

    public Date getDataFim() { 
        return dataFim; 
    }

    public boolean isAtiva() { 
        return ativa; 
    }

    public boolean isPaga() { 
        return paga; 
    }

    public Aluno getAluno() { 
        return aluno; 
    }

    public Plano getPlano() { 
        return plano; 
    }

    public void setPlano(Plano plano) { 
        this.plano = plano; 
    }

    public void realizarNotifolia() {
        System.out.println("Matricula realizada: " + idMatricula);
    }
    
    public void encolarNotifolia() {
        System.out.println("Matricula enfileirada: " + idMatricula);
    }
    
    public void renovarNotifolia() {
        this.ativa = true;
        this.dataFim = null;
        System.out.println("Matricula renovada: " + aluno.getNome());
    }
    
    public void realizarPagamento(double valor) {
        if (plano != null && valor >= plano.getValorPlano()) {
            this.paga = true;
            System.out.println("Pagamento realizado: R$ " + valor);
        } else {
            System.out.println("Pagamento recusado: valor insuficiente");
        }
    }
    
    public void cancelar() {
        this.ativa = false;
        this.dataFim = new Date();
        System.out.println("Matricula cancelada: " + aluno.getNome());
    }
}