package br.com.zup;

import java.util.Scanner;

public class Lista06_Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int dias[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Digite um dia da semana. 0 = Domingo, 1 = Segunda, etc..");
        int input = scan.nextInt();

      if (dias[input] == 1){
          System.out.println("Domingo");
      }else if (dias[input] == 2){
          System.out.println("Segunda");
      }else if (dias[input] == 4){
          System.out.println("Terça");
      }else if (dias[input] == 5){
          System.out.println("Quarta");
      }else if (dias[input] == 6){
          System.out.println("Quinta");
      }else if (dias[input] == 7){
          System.out.println("Sexta");
      }else if (dias[input] == 8){
          System.out.println("Sabado");
      }else {
          System.out.println("Dia inválido.");
      }

    }
}
