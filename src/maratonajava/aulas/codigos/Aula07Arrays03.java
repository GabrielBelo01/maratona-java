package maratonajava.aulas.codigos;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int [] numeros1 = {2,4,5,6,7,};
        int [] numeros2 = new int[]{1,2,3,4,5,6,7,};
//        for (int i = 0; i < numeros1.length; i++){
//            System.out.println(numeros1[i]);
//        }
        for(int i:numeros1){
            System.out.println(i);
        }

    }
}
