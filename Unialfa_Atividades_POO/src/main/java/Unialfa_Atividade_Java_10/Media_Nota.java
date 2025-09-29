
package Unialfa_Atividade_Java_10;

import javax.swing.JOptionPane;


public class Media_Nota {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite a Nota da Primeira Prova: ");
        double notaPrimeiraProva = Double.parseDouble(valor1);

        String valor2 = JOptionPane.showInputDialog("Digite a Nota da Segunda Prova: ");
        double notaSegundaProva = Double.parseDouble(valor2);

        String valor3 = JOptionPane.showInputDialog("Digite a Nota do Trabalho: ");
        double notaTrabalho = Double.parseDouble(valor3);

        double mediaNota = (notaPrimeiraProva + notaSegundaProva + notaTrabalho) / 3;

        if (mediaNota >= 6){
            JOptionPane.showMessageDialog(null, "Sua Nota Media e: " + mediaNota + ". Voce foi Aprovado");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Sua Nota Media e: " + mediaNota + ". Voce foi Reprovado");
        }
    }
}
