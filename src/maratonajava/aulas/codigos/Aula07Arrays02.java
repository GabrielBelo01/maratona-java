package maratonajava.aulas.codigos;

import java.util.Scanner;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];


         for (int i = 0; i < nomes.length; i++){
             System.out.println("Qual o nome?");
             nomes[i] = sc.nextLine();

         }

         for (int i = 0; i < nomes.length; i++){
             System.out.println(nomes[i]);

         }
    }
}
