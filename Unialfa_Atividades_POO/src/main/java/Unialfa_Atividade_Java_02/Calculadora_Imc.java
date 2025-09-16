package Unialfa_Atividade_Java_02;

import java.util.Scanner;

public class Calculadora_Imc {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Peso (em Quilos): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua Altura (em Metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Seu peso em IMC: " + imc);

        scanner.close();
    }
}
