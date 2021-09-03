package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista06_Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numerosTotal = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();


        for (int contador = 0; contador < 20; contador++){
            System.out.println("Digite 20 números para separar eles por IMPAR ou PAR");
            System.out.println("Digite o "+(contador +  1)+"º número.");
            int numero = scan.nextInt();
            numerosTotal.add(numero);
            if(numero % 2 == 0){
                numerosPares.add(numero);
            } else if (numero % 2 != 0) {
                numerosImpares.add(numero);
            }
        }
        System.out.println("A lista completa de números é:");
        System.out.println(numerosTotal);
        System.out.println("A lista completa de números pares é:");
        System.out.println(numerosPares);
        System.out.println("A lista completa de números impares é:");
        System.out.println(numerosImpares);
    }
}
