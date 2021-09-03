package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista06_Exercicio09 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa irá apresentar todos os números digitados em ordem reversa à que foi digitada.");


        for (int contador = 1; contador <= 10; contador++){
            System.out.println("Digite o número "+contador+"º número.");
            int numerosRecebidos = scan.nextInt();
            numeros.add(numerosRecebidos);
        }for (int contadorReverso = 9; contadorReverso >= 0; contadorReverso--){
            System.out.println(numeros.get(contadorReverso));
        }

    }
}
