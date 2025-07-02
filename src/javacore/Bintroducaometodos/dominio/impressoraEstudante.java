package javacore.Bintroducaometodos.dominio;

public class impressoraEstudante {
    public void impreme(Estudante estudante){

        System.out.println("----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Pelé";

    }
}
