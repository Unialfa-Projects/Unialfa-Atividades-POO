
package Unialfa_Atividade_Java_08;

import java.util.Scanner;


public class Campeonato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os Pontos do Lider do Campeonato: ");
        int pontosLiderCampeonatoBrasileiro = scanner.nextInt();

        System.out.println("Digite os Pontos do Lanterna do Campeonato: ");
        int pontosLanternaCampeonatoBrasileiro = scanner.nextInt();

        double vitoriasNecessarias = (pontosLiderCampeonatoBrasileiro - pontosLanternaCampeonatoBrasileiro);

        double divisao = vitoriasNecessarias/3;

        int qtdVitoriasArredondadas = (int) Math.ceil((double) divisao);

        System.out.println("O Lanterna precissa de " + qtdVitoriasArredondadas + " Vitorias (" + qtdVitoriasArredondadas*3 + " pontos ou mais) para ser Campeao");
    }
}
