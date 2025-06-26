package exercicios.aulas.codigos;

public class ExerciciosEstruturasCondicionais {
    public static void main(String[] args) {

        byte dia = 4;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opçao invalida");
                break;
        }


    }
}
