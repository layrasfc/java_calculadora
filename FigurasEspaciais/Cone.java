package CalculadoraGeometrica.FigurasEspaciais;

import CalculadoraGeometrica.Formatacao;

public class Cone {
    double raio;
    double altura;
    String forma;

    public Cone(double raio, double altura){
        this.altura = altura;
        this.raio = raio;
        this.forma = "Cone";
    }

    public double calcularVolume(){
        return (1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura;

    }

    public double calcularAreaSuperficial(){
        return Math.PI * raio * Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
    }

    public String informacoes() {
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
