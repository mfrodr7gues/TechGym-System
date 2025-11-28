import java.util.Date;

public class AvaliacaoFisica {

    // Atributos
    private int idAvaliacaoFisica;
    private Date dataAvaliacaoFisica;
    private double peso;
    private double altura;
    private double imc;

    // Construtor
    public AvaliacaoFisica(double peso, double altura) {

        this.idAvaliacaoFisica = (int) (Math.random() * 1000) + 2000;
        this.dataAvaliacaoFisica = new Date();
        this.peso = peso;
        this.altura = altura;
        this.imc = peso / (altura * altura);
    }

    // Acesso às privates usando getters e setters
    public int getIdAvaliacaoFisica() { 
        return idAvaliacaoFisica; 
    }

    public Date getDataAvailacamFisica() { 
        return dataAvaliacaoFisica; 
    }

    public double getPeso() { 
        return peso; 
    }

    public double getAltura() { 
        return altura; 
    }

    public double getImc() { 
        return imc; 
    }

    public void criarAvaliacaoFisica() {
        System.out.println("Avaliacao criada: " + idAvaliacaoFisica);
    }
    
    public void editarAvaliacaoFisica(double novoPeso, double novaAltura) {
        this.peso = novoPeso;
        this.altura = novaAltura;
        this.imc = peso / (altura * altura);
        System.out.println("Avaliacao editada");
    }
    
    public void salvarAvaliacaoFisica() {
        System.out.println("Avaliacao salva");
    }
    
    public void acessarAvaliacaoFisica() {
        System.out.println("Avaliacao Fisica - Peso: " + peso + " Altura: " + altura + " IMC: " + imc);
    }
}