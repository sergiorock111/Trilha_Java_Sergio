package conjugador;

import java.util.Scanner;

public class Verbo {
	private String radical;
	private String sufixo;

	public Verbo(String radical, String sufixo) {
		this.radical = radical;
		this.sufixo = sufixo;
	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public void conjugar() {

		System.out.println("Eu" + radical + "o");
		System.out.println("Tu" + radical + "as");
		System.out.println("Ele" + radical + "a");
		System.out.println("Nos" + radical + "amos");
		System.out.println("Vos" + radical + "ais");
		System.out.println("Eles" + radical + "am");
	}

	public static void main(String[] args) {
		/*
		 * String rad, suf; Scanner sc = new Scanner(System.in);
		 * System.out.println("digite o radical"); rad = sc.nextLine();
		 * System.out.println("digite o sufixo"); suf = sc.nextLine();
		 * 
		 * Verbo verbo = new Verbo("rad", "suf"); verbo.conjugar();
		 * System.out.println("Verbo:" +verbo.getRadical()+verbo.getSufixo());
		 */
		String palavra;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite uma palavra");
		palavra = sc.nextLine();

		int tamanhoSufixo = 3;
		String sufixo = palavra.substring(palavra.length() - tamanhoSufixo);
		String radical = palavra.substring(0, palavra.length() - tamanhoSufixo);
		System.out.println("Palavra: " + palavra);
		System.out.println("Sufixo: " + sufixo);
		System.out.println("Radical: " + radical);
	}
}
