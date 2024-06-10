package CalculadoraGeometrica.FigurasEspaciais;
import CalculadoraGeometrica.Formatacao;

import java.util.Locale;

public class Cilindro {
    double raio;
    double altura;
    String forma;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.forma = "Cilindro";
    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio, 2);

    }

    public double calcularAreaSuperficial(){
        return (2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio,2));
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

