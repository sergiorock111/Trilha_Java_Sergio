import java.util.Scanner;
import java.util.Random;

public class OperacoesArray {


    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }


    public static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1);
        }

        return array;
    }


    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }


    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }


    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        int[] arrayUsuario = criarArrayDoUsuario();


        int[] arrayAleatorio = criarArrayAleatorio(5, 50);

        System.out.println("\nArray do Usuário:");
        imprimirArray(arrayUsuario);

        System.out.println("\nArray Aleatório:");
        imprimirArray(arrayAleatorio);


        int somaUsuario = calcularSoma(arrayUsuario);
        int somaAleatorio = calcularSoma(arrayAleatorio);
        System.out.println("\nSoma do Array do Usuário: " + somaUsuario);
        System.out.println("Soma do Array Aleatório: " + somaAleatorio);

    
        int maiorUsuario = encontrarMaiorValor(arrayUsuario);
        int menorUsuario = encontrarMenorValor(arrayUsuario);
        System.out.println("\nMaior valor no Array do Usuário: " + maiorUsuario);
        System.out.println("Menor valor no Array do Usuário: " + menorUsuario);
    }

   
    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
