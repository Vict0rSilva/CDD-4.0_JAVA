package aula01;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite F ou M: ");
		String letra = entrada.next();
		
		if (letra == "F") {
			System.out.print("F-Feminino");
		}else if(letra == "M") {
			System.out.print("M-Masculino");
		}else {
			System.out.print("Letra invalida!");
		}
	}

}
