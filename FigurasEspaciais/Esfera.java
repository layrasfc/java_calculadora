package CalculadoraGeometrica.FigurasEspaciais;

import CalculadoraGeometrica.Formatacao;

public class Esfera {
    double raio;
    String forma;

    public Esfera(double raio){
        this.raio = raio;
        this.forma = "Esfera";
    }

    public double calcularVolume(){
        return ((4.0/3.0) * Math.pow(raio, 3)) * Math.PI;
    }

    public double calcularAreaSuperficial(){
        return (4*Math.PI) * Math.pow(raio, 2);
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
