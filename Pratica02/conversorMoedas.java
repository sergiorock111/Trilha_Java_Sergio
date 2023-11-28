

import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a taxa de câmbio (por exemplo, para Euros): ");
        double taxaCambio = scanner.nextDouble();

        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();


        double valorConvertido = converterDolarParaMoeda(quantidadeDolares, taxaCambio);

       
        System.out.printf("%.2f dólares equivalem a %.2f na moeda desejada.%n", quantidadeDolares, valorConvertido);


        scanner.close();
    }

    public static double converterDolarParaMoeda(double dolares, double taxaCambio) {
        return dolares * taxaCambio;
    }
    


