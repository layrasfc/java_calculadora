package CalculadoraGeometrica.FigurasEspaciais;

import CalculadoraGeometrica.FigurasPlanas.Quadrado;
import CalculadoraGeometrica.Formatacao;

public class Piramide {
    public double aresta;
    public double lado;
    public double altura;
    String forma;

    public Piramide(double aresta, double lado, double altura){
        this.aresta = aresta;
        this.lado = lado;
        this.altura = altura;
        this.forma = "Pirâmide";
    }

    public double calcularApotema(){
        return Math.sqrt(  (Math.pow(lado/2, 2)) + Math.pow(altura, 2)  );
    }
    public double calcularVolume(){
        Quadrado area = new Quadrado(lado);
        double areaPir = area.calcularArea();
        return (areaPir * altura)/3;
    }

    public double calcularAreaSuperficial(){
        return (2 * aresta * calcularApotema()) + Math.pow(aresta, 2);
    }

    public String informacoes(){
        String textoVolume = String.format("Volume: %.02f", calcularVolume());
        String textoArea = String.format("Área: %.02f", calcularAreaSuperficial());
        String volume;
        String area;

        if (calcularVolume() % 2 == 0){
            volume = textoVolume.toUpperCase();
        } else {
            volume = textoVolume.toLowerCase();
        }

        if (calcularAreaSuperficial() % 2 == 0){
            area = textoArea.toUpperCase();
        } else {
            area = textoArea.toLowerCase();
        }

        Formatacao f = new Formatacao();
        return String.format(f.subtitulo()+ "\n\t➤ Informações do(a) %s:\n\t- %s\n\t- %s", forma, area, volume);
    }
}
