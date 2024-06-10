package CalculadoraGeometrica;

import CalculadoraGeometrica.FigurasEspaciais.*;
import CalculadoraGeometrica.FigurasPlanas.*;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Formatacao f = new Formatacao(); // Formatação de texto

        // Variáveis Iniciais
        int acao = 0, choicePlana = 0, choiceEspacial = 0;
        double raio, lado, altura, aresta, base, largura, comprimento;
        boolean continuar = true; // Boolean auxiliar
        String nome;

        //  I N Í C I O
        System.out.print(f.saida() + "\tBem-vindo(a) à sua calculadora geométrica!\n");
        System.out.print(f.escolha() + "\tQual é o seu nome? ");
        nome = input.nextLine();
        Verificacao verificar = new Verificacao(nome);

        // M E N U - I N I C I A L
        while (acao != 3) { // Loop principal
            System.out.print("\n\n" + f.titulo() +"⁺˚⋆｡°✩₊ CALCULADORA GEOMÉTRICA\n");
            System.out.print(f.reset());
            System.out.printf(f.subtitulo() + "\n\tO que deseja fazer, %s? \n", nome);
            System.out.print(f.subtitulo() + "\t[1] Figuras Planas\n" +
                    "\t[2] Figuras Espaciais\n" +
                    "\t[3] Sair\n");

            acao = verificar.inicial(1, 3); // Método de tratamento de erros

            do {
                switch (acao) {
                    case 1:
                        System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ FIGURAS PLANAS\n");
                        System.out.print(f.reset());
                        System.out.print(f.subtitulo() + "\t[1] Círculo\n" +
                                "\t[2] Hexagono\n" +
                                "\t[3] Quadrado\n" +
                                "\t[4] Retângulo\n" +
                                "\t[5] Triângulo\n" +
                                "\t[6] Voltar\n");

                        choicePlana = verificar.inicial(1, 6);
                        break;
                    case 2:
                        System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ FIGURAS ESPACIAIS\n");
                        System.out.print(f.reset());
                        System.out.print(f.subtitulo() + "\t[1] Cilindro\n" +
                                "\t[2] Cone\n" +
                                "\t[3] Cubo\n" +
                                "\t[4] Esfera\n" +
                                "\t[5] Paralelepípedo\n" +
                                "\t[6] Pirâmide\n" +
                                "\t[7] Voltar\n");
                        choiceEspacial = verificar.inicial(1, 7);
                        break;
                    case 3:
                        break;
                }


            // Escolha do menu plano
            switch (choicePlana) {
                case 1:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ CÍRCULO\n");
                    System.out.print(f.reset());

                    raio = verificar.inputs("Raio");

                    Circulo circulo = new Circulo(raio);
                    System.out.println(circulo.informacoes());
                    break;
                case 2:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ HEXÁGONO\n");
                    System.out.print(f.reset());

                    lado = verificar.inputs("Lado");

                    Hexagono hexagono = new Hexagono(lado);
                    System.out.println(hexagono.informacoes());
                    break;
                case 3:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ QUADRADO\n");
                    System.out.print(f.reset());

                    lado = verificar.inputs("Lado");

                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println(quadrado.informacoes());
                    break;
                case 4:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ RETÂNGULO\n");
                    System.out.print(f.reset());

                    base = verificar.inputs("Base");
                    altura = verificar.inputs("Altura");

                    Retangulo retangulo = new Retangulo(base, altura);
                    System.out.println(retangulo.informacoes());
                    break;
                case 5:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ TRIÂNGULO\n");
                    System.out.print(f.reset());

                    lado = verificar.inputs("Lado");

                    Triangulo triangulo = new Triangulo(lado);
                    System.out.println(triangulo.informacoes());
                    break;
                case 6:
                    continuar = false;
                    break;
            }

            // Escolha do menu espacial
            switch (choiceEspacial) {
                case 1:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ CILINDRO\n");
                    System.out.print(f.reset());

                    raio = verificar.inputs("Raio");
                    altura = verificar.inputs("Altura");

                    Cilindro cilindro = new Cilindro(raio, altura);
                    System.out.println(cilindro.informacoes());
                    break;
                case 2:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ CONE\n");
                    System.out.print(f.reset());

                    raio = verificar.inputs("Raio");
                    altura = verificar.inputs("Altura");

                    Cone cone = new Cone(raio, altura);
                    System.out.println(cone.informacoes());
                    break;
                case 3:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ CUBO\n");
                    System.out.print(f.reset());
                    lado = verificar.inputs("Lado");
                    Cubo cubo = new Cubo(lado);
                    System.out.println(cubo.informacoes());
                    break;
                case 4:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ ESFERA\n");
                    System.out.print(f.reset());
                    raio = verificar.inputs("Raio");
                    Esfera esfera = new Esfera(raio);
                    System.out.println(esfera.informacoes());
                    break;
                case 5:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ PARALELEPÍPEDO\n");
                    System.out.print(f.reset());
                    altura = verificar.inputs("Altura");
                    largura = verificar.inputs("Largura");
                    comprimento = input.nextDouble();
                    Paralelepipido paralelepipido = new Paralelepipido(comprimento, altura, largura);
                    System.out.println(f.subtitulo() + paralelepipido.informacoes());
                    break;
                case 6:
                    System.out.print("\n\n" + f.titulo() + "⁺˚⋆｡°✩₊ PIRÂMIDE\n");
                    System.out.print(f.reset());

                    
                    aresta = verificar.inputs("Aresta");
                    lado = verificar.inputs("Lado");
                    altura = verificar.inputs("Altura");

                    Piramide piramide = new Piramide(aresta, lado, altura);
                    System.out.println(piramide.informacoes());
                    break;
                case 7:
                    continuar = false;
            }
            } while (continuar); // Enquanto continuar for true
        }

    }
}

