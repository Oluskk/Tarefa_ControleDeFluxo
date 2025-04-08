package br.com.lSousa;

import java.util.Scanner;

public class AvaliacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das 4 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe a média
        System.out.println("Média final: " + media);

        // Lógica condicional
        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }

        scanner.close();
    }
}