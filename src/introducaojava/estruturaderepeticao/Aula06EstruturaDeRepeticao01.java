package introducaojava.estruturaderepeticao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println("Dentro do while " + contador++);
        }

        System.out.println("======================");

        contador = 0;
        do {
            System.out.println("Dentro do do-while " + contador++);
        } while (contador <= 10);

        System.out.println("======================");

        for (contador = 0 ; contador <=10; contador++) {
            System.out.println("Dentro do for "+contador);
        }

    }
}
