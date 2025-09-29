
package Unialfa_Atividade_Java_09;

import javax.swing.JOptionPane;


public class Transacao {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o Valor da Transação: ");
        double valorTransacao = Double.parseDouble(valor1);

        String valor2 = JOptionPane.showInputDialog("Digite o Valor Venal: ");
        double valorVenal = Double.parseDouble(valor2);

        String valor3 = JOptionPane.showInputDialog("Digite o Percentual de Imposto: ");
        double percentualImposto = Double.parseDouble(valor3);

        double maiorValor = valorTransacao - valorVenal;

        double valorImposto = (maiorValor * percentualImposto) / 100;

        JOptionPane.showMessageDialog(null, "O Valor do Imposto a ser Pago e: " + valorImposto);
        
    }
}
