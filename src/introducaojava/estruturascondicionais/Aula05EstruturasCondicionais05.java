package introducaojava.estruturascondicionais;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprimir o dia da semana, considerando 1 como domingo
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual dia da semana estamos?");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        System.out.println("--verficação do dia concluida--");
    }
}
