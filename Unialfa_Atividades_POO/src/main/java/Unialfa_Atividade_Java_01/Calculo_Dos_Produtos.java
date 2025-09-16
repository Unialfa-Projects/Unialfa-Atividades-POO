
package Unialfa_Atividade_Java_01;

import java.util.Scanner;

public class Calculo_Dos_Produtos {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu primeiro valor: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o seu segundo valor: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Digite o seu terceiro valor: ");
        int numero3 = scanner.nextInt();

        int resultado = numero1 * numero2 * numero3;
        System.out.print("O resultado dos produtos e: " + resultado);
    
        scanner.close();
    }
}
