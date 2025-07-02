package javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Calculadora {

    public void somaDoisNumeors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        int res =  num1 + num2;
        System.out.println("O resultado é: " + res);
    }

    public void subtraiDoisNumeors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        int res =  num1 - num2;
        System.out.println("O resultado é: " + res);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }












}
