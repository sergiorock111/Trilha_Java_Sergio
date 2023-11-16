package Pratica01;
import java.util.Scanner;

public class calculadoraSimples {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double num1 = input.nextDouble();

		        System.out.print("Digite o segundo número: ");
		        double num2 = input.nextDouble();

		        System.out.print("Digite a operação (+, -, *, /): ");
		        char operator = input.next().charAt(0);

		        double resultado;

		        switch (operator) {
		            case '+':
		                resultado = num1 + num2;
		                break;

		            case '-':
		                resultado = num1 - num2;
		                break;

		            case '*':
		                resultado = num1 * num2;
		                break;

		            case '/':
		                resultado = num1 / num2;
		                break;

		            default:
		                System.out.printf("Operação inválida!");
		                return;
		        }

		        System.out.println(num1 + " " + operator + " " + num2 + " = " + resultado);
		    
		}
}
		
