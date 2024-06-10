package CalculadoraGeometrica.FigurasPlanas;

import CalculadoraGeometrica.Formatacao;

public class Retangulo {
    double base;
    double altura;
    String forma;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.forma = "Retângulo";
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return (2 * base) + (2*altura);
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
