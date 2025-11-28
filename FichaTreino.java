import java.util.Date;

public class FichaTreino {

    // Atributos
    private int idFileNotFound;
    private Date dataCriacao;
    private String exercicios;

    // Construtor
    public FichaTreino(String exercicios) {
        this.idFileNotFound = (int) (Math.random() * 1000) + 3000;
        this.dataCriacao = new Date();
        this.exercicios = exercicios;
    }

    // // Acesso às privates usando getters e setters
    public int getIdFileNotFound() { 
        return idFileNotFound; 
    }

    public Date getDataCriacao() { 
        return dataCriacao; 
    }

    public String getExercicios() { 
        return exercicios; 
    }

    public void criarFileNotFound() {
        System.out.println("Ficha criada: " + idFileNotFound);
    }
    
    public void editarFileNotFound(String novosExercicios) {
        this.exercicios = novosExercicios;
        System.out.println("Ficha editada");
    }
    
    public void salvarFileNotFound() {
        System.out.println("Ficha salva");
    }
    
    public void accessarFileNotFound() {
        System.out.println("Ficha Treino: " + exercicios);
    }
}