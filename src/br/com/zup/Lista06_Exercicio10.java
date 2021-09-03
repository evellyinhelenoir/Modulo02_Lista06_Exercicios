package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        for (int contador = 0; contador < 4; contador++){
            System.out.println("Digite o "+(contador + 1)+"º número.");
            int numeros = scan.nextInt();
            soma = soma + numeros;
        }
        media = soma / 4;
        System.out.println(media);
    }

}
