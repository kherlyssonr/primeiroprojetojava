import java.util.Scanner;

public class Leitura {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito?");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLacamento = leitura.nextInt();
        System.out.println("Qual sua avaliaçao?");
        double avaliacao = leitura.nextDouble();

        System.out.println("O meu filme favorito é " + filme);
        System.out.println("Ano de lançamento do filme " + anoDeLacamento);
        System.out.println("Minha avaliação " + avaliacao);

    }

}
