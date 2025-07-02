package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.impressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Maria";
        estudante01.idade = 22;
        estudante01.sexo = 'F';

        estudante02.nome = "Pedro";
        estudante02.idade = 17;
        estudante02.sexo = 'M';

        impressora.impreme(estudante01);
        impressora.impreme(estudante02);

    }
}
