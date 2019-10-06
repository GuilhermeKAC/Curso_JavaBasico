/*
 * Guilherme Kruszynski
 * Aprendendo input
 * 
 */
package tipoprimitivos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class TipoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a Nota: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é : %.2f\n", nome, nota);
        /*System.out.println(""); para formatar
        */
    }
    
}
