package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
public class Lista06_Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Integer> numeros = new ArrayList<>();
        int soma = 0;
        int multiplicacao = 1;

        for (int contador = 0; contador < 5; contador++){
            System.out.println("Digite o "+(contador + 1)+"º número.");
            int numeroDigitado = scan.nextInt();
            numeros.add(numeroDigitado);
            soma = soma + numeroDigitado;
            multiplicacao = multiplicacao * numeroDigitado;
        }
        System.out.println(numeros);
        System.out.println(soma);
        System.out.println(multiplicacao);
    }
}
