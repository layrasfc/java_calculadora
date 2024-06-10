package CalculadoraGeometrica.FigurasEspaciais;

import CalculadoraGeometrica.Formatacao;

public class Cubo {
    double lado;
    String forma;

    public Cubo(double lado){
        this.lado = lado;
        this.forma = "Cubo";
    }

    public double calcularVolume(){
        return Math.pow(lado, 3);

    }

    public double calcularAreaSuperficial(){
        return Math.pow(lado, 2) * 6;
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
