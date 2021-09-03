package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor informe o preço dos 3 produtos.\nInforme o valor do produto 1.");
        int produto1 = scan.nextInt();
        System.out.println("Informe o valor do produto 2.");
        int produto2 = scan.nextInt();
        System.out.println("Informe o valor do produto 3.");
        int produto3 = scan.nextInt();

        if (produto1 > 0 & produto2 > 0 & produto3 > 0) {
            if (produto1 < produto2 & produto1 < produto3) {
                System.out.println("O produto 1 é o mais barato, no valor de: " + produto1 + " reais.");
            } else if (produto2 < produto1 & produto2 < produto3) {
                System.out.println("O produto 2 é o mais barato, no valor de: " + produto2 + " reais.");
            } else if (produto3 < produto1 & produto3 < produto2) {
                System.out.println("O produto 3 é o mais barato, no valor de: " + produto3 + " reais.");
            }
        }else {
            System.out.println("Valor Inválido. Por favor, insira um valor maior que 0.");
        }
    }
}