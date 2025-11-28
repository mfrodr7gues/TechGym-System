import java.util.Date;

public class FichaTreino {

    // Atributos
    private int idFichaDeExercicios;
    private Date dataCriacao;
    private String exercicios;

    // Construtor
    public FichaTreino(String exercicios) {
        this.idFichaDeExercicios = (int) (Math.random() * 1000) + 3000;
        this.dataCriacao = new Date();
        this.exercicios = exercicios;
    }

    // // Acesso às privates usando getters e setters
    public int getIdFichaDeExercicios() { 
        return idFichaDeExercicios; 
    }

    public Date getDataCriacao() { 
        return dataCriacao; 
    }

    public String getExercicios() { 
        return exercicios; 
    }

    public void criarFichaDeExercicios() {
        System.out.println("Ficha criada: " + idFichaDeExercicios);
    }
    
    public void editarFichaDeExercicios(String novosExercicios) {
        this.exercicios = novosExercicios;
        System.out.println("Ficha editada");
    }
    
    public void salvarFichaDeExercicios() {
        System.out.println("Ficha salva");
    }
    
    public void accessarFichaDeExercicios() {
        System.out.println("Ficha Treino: " + exercicios);
    }
}