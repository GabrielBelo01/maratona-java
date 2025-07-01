package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcos";
        professor.sexo = 'M';
        professor.idade = 37;
        System.out.print("Nome: "+professor.nome + " idade:  " + professor.sexo + " Sexo: " + professor.idade);
    }
}
