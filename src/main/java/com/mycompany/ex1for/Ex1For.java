/*
1. Leia um valor inteiro X. Em seguida mostre os ímpares de 
1 até X, um valor por linha, inclusive o X, se for o caso.
     
ENTRADA: Número digitado
8
    
SAIDA: Tela do programa
1
3
5
7
 */
package com.mycompany.ex1for;

import java.util.Scanner;

public class Ex1For {

    public static void main(String[] args) {
        System.out.println("Digite um número: \n");
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();

        for (int i = 0; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println("Impar:\n" + i);
            }
        }
        teclado.close();
    }
}
