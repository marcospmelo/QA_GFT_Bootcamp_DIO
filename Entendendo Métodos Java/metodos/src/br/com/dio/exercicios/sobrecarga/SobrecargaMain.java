package br.com.dio.exercicios.sobrecarga;

public class SobrecargaMain {
    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        QuadrilateroSobrecarga.area(3);
        QuadrilateroSobrecarga.area(5d,5d);
        QuadrilateroSobrecarga.area(7,8,9);
        QuadrilateroSobrecarga.area(5f,5f);
    }
}