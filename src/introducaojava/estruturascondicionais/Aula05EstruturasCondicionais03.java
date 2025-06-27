package introducaojava.estruturascondicionais;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu nao consigo, mas um dia vou conseguir";

        Scanner sc =  new Scanner(System.in);
        System.out.println("Qual seu salario?");
        salario = sc.nextDouble();

        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // OU

        System.out.println(salario >= 5000 ? mensagemDoar : mensagemNaoDoar);
    }

}
