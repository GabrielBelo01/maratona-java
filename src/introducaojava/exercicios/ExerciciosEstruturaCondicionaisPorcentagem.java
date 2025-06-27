package introducaojava.exercicios;

import java.util.Scanner;

public class ExerciciosEstruturaCondicionaisPorcentagem {
    // 0 a 34.712  = 9.70%
    // 34.713 a 68.507 = 37.35%
    // 68.508       = 49.50%
    public static void main(String[] args) {
        double salario;
        double percentual;
        double valorImposto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salario?");
        salario = sc.nextDouble();

        if (salario <= 34712){
            percentual = 9.70 / 100;
            valorImposto = salario * percentual;
        } else if (salario >= 34713 && salario <= 68507) {
            percentual = 37.35 / 100;
            valorImposto = salario * percentual;
        } else{
            percentual = 49.50 / 100;
            valorImposto = salario * percentual;
        }

        System.out.println("Voce tera que pagar "+valorImposto+" de imposto");
        System.out.println("E seu salario ficara:" +(salario-valorImposto));

    }
}
