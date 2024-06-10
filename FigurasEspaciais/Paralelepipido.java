package CalculadoraGeometrica.FigurasEspaciais;

import CalculadoraGeometrica.Formatacao;

public class Paralelepipido {
    double comprimento;
    double altura;
    double largura;
    String forma;

    public Paralelepipido(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.forma = "Paralelepípedo";
    }

    public double calcularVolume(){
        return comprimento * altura * largura;
    }

    public double calcularAreaSuperficial(){
        return 2 * ((comprimento * altura) + (altura * largura) + (comprimento * largura));
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
