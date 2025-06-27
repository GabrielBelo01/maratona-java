package introducaojava.estruturascondicionais;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        String isResposta;
        int idade;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Informe a idade: ");
            idade =  sc.nextInt();

            if (idade < 15) {
                System.out.println("Infantil");
            } else if (idade >= 15 && idade < 18) {
                System.out.println("Juvena");
            } else {
                System.out.println("Adulto");
            }
            sc.nextLine();
            System.out.println("Continuar??");
            isResposta = sc.nextLine();

        } while(!isResposta.equalsIgnoreCase("nao"));

        System.out.println("Obrigado!!");




    }
}
