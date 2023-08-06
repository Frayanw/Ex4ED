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

        //Condicionais simples
        System.out.print("Digite o 1� n�mero: ");
        num1 = sc.nextInt();

        System.out.print("Digite o 2� n�mero: ");
        num2 = sc.nextInt();

        System.out.print("Digite o 3� n�mero: ");
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
        System.out.println("N�meros em ordem crescente: " + num1 + ", " + num2 + ", " + num3);

        System.out.println("");
        System.out.println("Fa�a outra vez");
        System.out.println("");
        
        //Condicionais aninhadas
        System.out.print("Digite o primeiro n�mero: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro n�mero: ");
        num3 = sc.nextInt();

        int menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("N�meros em ordem crescente: " + menor + ", " + meio + ", " + maior);

    }
}
