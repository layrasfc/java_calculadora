package CalculadoraGeometrica.FigurasPlanas;

import CalculadoraGeometrica.Formatacao;

public class Circulo {
    double raio;
    String forma;

    public Circulo(double raio){
        this.raio = raio;
        this.forma = "Círculo";
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
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
