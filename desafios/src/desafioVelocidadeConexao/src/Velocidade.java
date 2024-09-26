import java.util.Scanner;

public class Velocidade {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int contador = 0;

        int[] velArray = new int[velocidades.length];

        for(int i = 0; i < velocidades.length; i++) {
            velArray[i] = Integer.parseInt(velocidades[i]);
            total += velArray[i];
            contador ++;
        }

        int media = total / contador;

        // TODO: Some todas as velocidades registradas e calcule a média
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
