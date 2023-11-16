package Pratica01;
	import java.util.Scanner;
	
public class conversorTemperatura {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a temperatura: ");
	        double temperatura = input.nextDouble();

	        System.out.print("Digite a unidade de origem (Celsius ou Fahrenheit): ");
	        String unidadeOrigem = input.next();

	        double resultado;

	        if (unidadeOrigem.equalsIgnoreCase("Celsius")) {
	            resultado = (temperatura * 9/5) + 32;
	            System.out.println(temperatura + " graus Celsius é igual a " + resultado + " graus Fahrenheit.");
	        } else if (unidadeOrigem.equalsIgnoreCase("Fahrenheit")) {
	            resultado = (temperatura - 32) * 5/9;
	            System.out.println(temperatura + " graus Fahrenheit é igual a " + resultado + " graus Celsius.");
	        } else {
	            System.out.println("Unidade de origem inválida!");
	        }
	    }
	}
	

