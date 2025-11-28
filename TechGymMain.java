import java.util.Date;

public class TechGymMain {

    public static void main(String[] args) {
        System.out.println("Teste da TechGym iniciado!");

        Plano plano1 = new Plano(1, "Basico", "Musculacao", 80.0, 1);
        Plano plano2 = new Plano(2, "Premium", "Completo", 120.0, 1);

        Aluno aluno1 = new Aluno("Otávio", "loueiz@email.com", "loueZ123!", 1, "11111111111", new Date());
        Instrutor instrutor1 = new Instrutor("Rodrigo", "rodrigoaraujo@academia.com", "Instrutor123", 1);

        aluno1.realizarLogin("loueiz@email.com", "loueZ123!");
        instrutor1.realizarLogin("rodrigoaraujo@academia.com", "Instrutor123");

        aluno1.escolherPlano(plano1);
        aluno1.realizarPagamento(80.0);

        instrutor1.adicionarAluno(aluno1);
        instrutor1.libstrackesto(aluno1);

        aluno1.criarFichaTreino("Treino A - Costas e bíceps", "Puxada alta, remada baixa, pulldown, rosca direta, rosca scott, rosca 45, rosca inversa");
        aluno1.criarAvaliacaoFisica(70.0, 1.70);

        aluno1.realizarLogout();
        instrutor1.realizarLogout();

        System.out.println("Teste da TechGym finalizado!");
    }
}