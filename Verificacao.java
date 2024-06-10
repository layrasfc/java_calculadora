package CalculadoraGeometrica;

import java.util.Scanner;

public class Verificacao {
    public String nome;
    public boolean auxiliar; // Boolean auxiliar
    public Verificacao(String nome){
        this.nome = nome;
    }

    public int inicial(int entrada, int limite){
        Scanner input = new Scanner(System.in);
        Formatacao f = new Formatacao();

        auxiliar = false;
        int verificar = 0;

        do {
            try {
                System.out.printf(f.escolha() + "\n\tDigite sua escolha, %s: ", nome);
                verificar = input.nextInt();

                // Dentro do límite de opções
                if (verificar < entrada || verificar > limite) {
                    System.out.println(f.error() + "\tERROR! Opção inválida. Tente novamente." + f.reset());
                } else {
                    auxiliar = true;
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println(f.error() + "\tERROR! Opção inválida. Tente novamente." + f.reset());
            }
        } while (!auxiliar);

        return verificar;
    }

    public double inputs(String info){
        Scanner input = new Scanner(System.in);
        Formatacao f = new Formatacao();
        auxiliar = false;
        double verificar = 0;

        do {
            try {
                System.out.printf(f.escolha() + "\t%s da forma: ", info);
                verificar = input.nextDouble();

                if (verificar <= 0){
                    System.out.println(f.error() + "\tERROR! Opção inválida. Tente novamente." + f.reset());
                } else {
                    auxiliar = true;
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println(f.error() + "\tERROR! Opção inválida. Tente novamente." + f.reset());
            }
        } while (!auxiliar);

        return verificar;
    }

}
