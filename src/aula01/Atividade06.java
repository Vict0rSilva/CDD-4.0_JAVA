package aula01;
import java.util.Scanner;
public class Atividade06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.println("Responda as perguntas com 1 para'sim' e 2 para 'não'.");
        
        System.out.print("Telefonou para a vítima? ");
        int resposta1 = entrada.nextInt();

        System.out.print("Esteve no local do crime? ");
        int resposta2 = entrada.nextInt();

        System.out.print("Mora perto da vítima? ");
        int resposta3 = entrada.nextInt();

        System.out.print("Devia para a vítima? ");
        int resposta4 = entrada.nextInt();

        System.out.print("Já trabalhou com a vítima? ");
        int resposta5 = entrada.nextInt();

        int cont = 0;

        if (resposta1 == 1) {
            cont++;
        }

        if (resposta2 == 1) {
            cont++;
        }

        if (resposta3 == 1) {
            cont++;}

        if (resposta4 == 1) {
            cont++;}

        if (resposta5 == 1) {
            cont++;}

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont >= 3 && cont <= 4) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

	}

}
