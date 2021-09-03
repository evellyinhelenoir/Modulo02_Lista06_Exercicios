package br.com.zup;

public class Lista06_Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Este programa informa todos os números impares entre 1 e 50");


       int soma = 0;
       int numeros = 51;
       int contador = 0;

       while (contador < numeros){

           if(contador % 2 == 0){
               System.out.println("["+contador+"] Este número é par");
           }else if(contador % 2 != 0){
               System.out.println("["+contador+"] Este número é impar");
           }


           contador++;
       }

    }
}
