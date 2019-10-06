/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidadevotar;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ProgramaIdadeVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu Ano de Nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2019 - ano;
        System.out.println("Sua idade é: " + idade);
        if (idade < 16){
            System.out.println("Não pode Votar");
        } else if (idade >= 16 && idade < 18){
            System.out.println("Voto Opcional");
        } else if (idade >= 18 && idade < 70){
            System.out.println("Voto Obrigatório");
        } else if (idade > 70) {
            System.out.println("Voto Opcional");
        }           
    }
    
}
