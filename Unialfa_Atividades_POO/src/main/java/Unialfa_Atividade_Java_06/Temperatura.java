
package Unialfa_Atividade_Java_06;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor da Temperatura (em Celsius): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println();
        System.out.println("O Valor da Temperatura em Fahrenheit e: " + fahrenheit + "F");
        System.out.println(celsius + "C = "+ fahrenheit + "F");

    }
}
