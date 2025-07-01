package javacore.Aintroducaoclasses.test;


import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudandeTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Maria";
        estudante.idade = 22;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
