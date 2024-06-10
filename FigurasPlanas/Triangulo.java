package CalculadoraGeometrica.FigurasPlanas;

import CalculadoraGeometrica.Formatacao;

public class Triangulo {
    double lado;
    String forma;

    public Triangulo(double lado){
        this.lado = lado;
        this.forma = "Triângulo";
    }

    public double calcularPerimetro(){
        return lado * 3;
    }

    public double calcularArea(){
        return lado * Math.sqrt(3.0/4.0);
    }

    public String informacoes(){
        String textoArea = String.format("Área: %.02f", calcularArea());
        String textoPerimetro = String.format("Perímetro: %.02f", calcularPerimetro());

        String perimetro;
        String area;

        if (calcularArea() % 2 == 0){
            area = textoArea.toUpperCase();
        } else {
            area = textoArea.toLowerCase();
        }

        if (calcularPerimetro() % 2 == 0){
            perimetro = textoPerimetro.toUpperCase();
        } else {
            perimetro = textoPerimetro.toLowerCase();
        }

        Formatacao f = new Formatacao();
        return String.format(f.subtitulo()+ "\n\t➤ Informações do(a) %s:\n\t- %s\n\t- %s", forma, area, perimetro);
    }
}
