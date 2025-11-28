public class Plano {

    // Atributos
    private int idPlano;
    private String nomePlano;
    private String descricao;
    private double valorPlano;
    private int duracaoMeses;

    // Construtor
    public Plano(int idPlano, String nomePlano, String descricao, double valorPlano, int duracaoMeses) {

        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.descricao = descricao;
        this.valorPlano = valorPlano;
        this.duracaoMeses = duracaoMeses;
    }

    // Acesso às privates usando getters e setters
    public int getIdPlano() {
        return idPlano; 
    }
    public String getNomePlano() {
        return nomePlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void selecionarPlano() {
        System.out.println("Plano selecionado: " + nomePlano);
    }
    
    public void visualizarPlano() {
        System.out.println("Plano: " + nomePlano + " - R$ " + valorPlano);
    }
}