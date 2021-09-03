package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorNumero;
        int menorNumero;

        System.out.println("Digite 5 números para ver qual é o maior entre eles.\nInforme o 1º número.");
        int primeiroNumero = scan.nextInt();
        maiorNumero = primeiroNumero;
        menorNumero = primeiroNumero;

        for(int contador = 1; contador < 5; contador ++){
            System.out.println("Informe o "+(contador + 1)+"º número.");
            int numero = scan.nextInt();
            if(numero > maiorNumero){
                maiorNumero = numero;
            }else {
                menorNumero = numero;
            }
        }
        System.out.println("Maior número ["+maiorNumero+"]");
        System.out.println("Menor número ["+menorNumero+"]");
    }
}
