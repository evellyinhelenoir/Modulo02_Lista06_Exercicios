package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número.");
        int primeiroNumero = scan.nextInt();
        System.out.println("Insira o segundo número.");
        int segundoNumero = scan.nextInt();

        System.out.println("Intervalo de Números entre "+primeiroNumero+" e "+segundoNumero);
        while (primeiroNumero < segundoNumero){
            System.out.println(primeiroNumero);
            primeiroNumero++;
        }
    }
}
