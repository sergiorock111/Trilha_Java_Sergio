import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;


        int tentativa;

        do {
        
            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
            tentativa = scanner.nextInt();

        
            if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (tentativa != numeroAleatorio);

      
        scanner.close();
    }
}
