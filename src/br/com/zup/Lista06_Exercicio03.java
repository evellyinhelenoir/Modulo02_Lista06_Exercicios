package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qual tabuada deseja calcular de 1 até 10");
        int escolherTabuada = scan.nextInt();
        int resultado = 0;

        for (int calculo = 1; calculo < 11; calculo ++){
            resultado = escolherTabuada * calculo;
            System.out.println(escolherTabuada+ " x "+ calculo);
        }



    }
}
