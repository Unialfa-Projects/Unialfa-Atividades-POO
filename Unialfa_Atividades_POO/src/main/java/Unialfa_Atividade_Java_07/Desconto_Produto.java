
package Unialfa_Atividade_Java_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Desconto_Produto {
    public static void main(String[] args) {

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);


        try {
                System.out.println("Digite o Valor do Produto:");
                double valorProduto = Double.parseDouble(reader.readLine());
                
                System.out.println("Digite a Porcentagem de Desconto *Sem a porcentagem*: ");
                double valorDesconto = Double.parseDouble(reader.readLine());

                double valorDescontoPorProduto = (valorProduto * valorDesconto) / 100;

                double valorFinal = valorProduto - valorDescontoPorProduto;
                System.out.println("Esse e o seu desconto " + valorFinal + " R$");


        } catch (IOException e ){
                System.out.println("Ouve um erro inesperado");
        }

        

    }
}
