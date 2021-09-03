package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista06_Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador = 0;

        while(contador < 5){
            System.out.println("Digite o "+(contador + 1)+"º número.");
            int numeroDigitado = scan.nextInt();
            numeros.add(numeroDigitado);

            contador++;
        }
        System.out.println("Os números digitados na onrdem foram: "+numeros);

    }
}
