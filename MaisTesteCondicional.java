package testavariaveis;

import java.util.Scanner;

public class MaisTesteCondicional {

	public static void main(String[] args) {
		
		System.out.println("Sistema de Autoriza��o Para Maiores de Idade");
		int idade;
		String quantidadePessoas;;
		
		Scanner ler = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		
		if (idade >= 18) {
			System.out.println("Seja bem vindo!");
		}
		else {
			System.out.println("Voc� est� acompanhado por um maior de idade? sim/n�o");
			quantidadePessoas = leitura.nextLine();
			if (quantidadePessoas.equals("sim") ) {
				System.out.println("Autorizado, pode entrar!");
			}
			else {
				System.out.println("Voc� n�o tem permiss�o para entrar!");				
			}
		}
	}
	
}