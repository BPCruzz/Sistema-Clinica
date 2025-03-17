import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Clinica {

    public void menuInicial() {

        //Scanner teclado = new Scanner(System.in);
        exibirMenuInical();

    }

    private void exibirDataHora() {
        // Obtém a data e hora atuais
        LocalDateTime dataEHora = LocalDateTime.now();

        // Define um formato desejado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Formata a data e exibe
        String dataFormatada = dataEHora.format(formato);
        System.out.println(dataFormatada);
    }

    private void exibirMenuInical() {

        System.out.print("""
                Bem Vindo(a) A Clinica
                Menu Inicial

                (0) Salvar e Sair
                (1) Iniciar Atendimento
                (2) Cadastrar Médico
                (3) Informações

                """);

        exibirDataHora();

    }

}
