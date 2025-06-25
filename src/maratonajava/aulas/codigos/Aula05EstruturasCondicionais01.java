package maratonajava.aulas.codigos;
import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual sua idade? ");
        int idade = sc.nextInt();

        boolean isAutotizadoComprarBebida = idade >= 18;
        if (isAutotizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.printf("Acesso negado!!");
        }











    }
}
