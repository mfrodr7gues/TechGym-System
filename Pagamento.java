import java.util.Date;

public class Pagamento {

    // Atributos 
    private int idPagamento;
    private Date dataPagamento;
    private double valorPagamento;
    private String metodoPagamento;
    private boolean statusPagamento;
    private Matricula matricula;

    // Construtor 
    public Pagamento (int idPagamento, double valorPagamento, String metodoPagamento, Matricula matricula) {

        this.idPagamento = idPagamento;
        this.dataPagamento = new Date();
        this.valorPagamento = valorPagamento;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = false;
        this.matricula = matricula;
    }

    // Acesso às privates usando getters e setters
    // ???

    public void realizarPagamento() {
        if (matricula.getPlano() != null && valorPagamento >= matricula.getPlano().getValorPlano()) {
            this.statusPagamento = true;
            matricula.realizarPagamento(valorPagamento);
            System.out.println("Pagamento confirmado: " + idPagamento);
        }
    }
    
    public void verifierNotifolia() {
        System.out.println("Matricula ativa: " + matricula.isAtiva());
    }
    
    public void stabilizerStatus() {
        System.out.println("Status pagamento: " + statusPagamento);
    }
}