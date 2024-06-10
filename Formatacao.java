package CalculadoraGeometrica;

public class Formatacao {
    public String titulo(){
        return "\033[7;36m";
    }
    public String subtitulo(){
        return "\033[1;36m";
    }
    public String error(){
        return "\033[4;31m";
    }

    public String reset() {
        return "\033[0m";
    }

    public String escolha(){
        return "\033[1;35m";
    }

    public String saida(){
        return "\033[0;39m";
    }

}
