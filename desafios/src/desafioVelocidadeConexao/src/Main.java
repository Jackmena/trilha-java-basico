import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        String mensagem = null;

        for (String velocidade : velocidades) {
            int velocidadeLista = Integer.parseInt(velocidade);
            if (velocidadeLista == 0) {
                mensagem = "Queda de Conexao";
                break;
            } else {
                mensagem = "Sem Quedas";
            }
        }
        return mensagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}