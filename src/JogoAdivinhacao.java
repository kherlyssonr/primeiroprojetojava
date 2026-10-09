import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
   public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
        Random numeroAleatorio = new Random();
        int geraNumero = numeroAleatorio.nextInt (101);

        int tentativa = 0;

        while ( tentativa < 5 ){
            System.out.println("Qual é o numero ?");
            int palpite = leitura.nextInt();

            if (palpite == geraNumero){
                System.out.println("Você acertou!!!! ");
                break;
            } else if ( palpite > geraNumero){
                System.out.println("Palpite é MAIOR que numero aleatorio");
            } else if (palpite < geraNumero) {
                System.out.println("Palpite é MENOR que numero aleaotorio");
            }

            tentativa++;

            System.out.println("Você ainda tem " + ( 5 - tentativa) + " tentativas!");
        }

        if (tentativa == 5 ){
            System.out.println("Fim de jogo! Você perdeu!");
            System.out.println("O numero secreto era: " + geraNumero);
        }
   }
    }

