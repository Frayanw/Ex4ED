package exercicio4ed;

import java.util.Scanner;

public class Exercicio4ED {

    public static void main(String[] args) {
        /*Fazer um programa que receba 3 n�meros inteiros quaisquer e os ordene na forma crescente. Fazer
        duas solu��es. Uma solu��o utilizando apenas estruturas condicionais simples e outra utilizando
        estruturas condicionais aninhadas. Obs.: Utilizar apenas vari�veis simples (N�o utilizar vetor na
        solu��o).*/
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, aux;

        System.out.println("Digite o 1� n�mero ");
        num1 = sc.nextInt();

        System.out.println("Digite o 2� n�mero ");
        num2 = sc.nextInt();

        System.out.println("Digite o 3� n�mero ");
        num3 = sc.nextInt();
        
        if (num2 > num3) {
            aux = num3;
            num3 = num2;
            num2 = aux;
        }
        if (num1 > num3) {
            aux = num3;
            num3 = num1;
            num1 = aux;
        }
        if (num1 > num2) {
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }

}
