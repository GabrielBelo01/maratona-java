package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagen";
        carro1.modelo = "Golf MK8";
        carro1.ano = 2025;

        carro2.marca = "BMW";
        carro2.modelo = "M3 Competition";
        carro2.ano = 2025;

        System.out.println("Carro 01");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 02");
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
