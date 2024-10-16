package src.main;

import src.funcoes.Pessoa;
import src.funcoes.Aluno;
import src.funcoes.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("José", "22222222222", 70.0, 1.75);
        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.println("CPF válido: " + FuncoesUteis.verificarCpf(pessoa.getCpf()));
        System.out.println("IMC: " + FuncoesUteis.calcularIMC(pessoa.getPeso(), pessoa.getAltura()));

        // Criando um objeto Aluno
        Aluno aluno = new Aluno("Juninho", "33333333333", 60.0, 1.74, 80.0, 7.0);
        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("CPF válido: " + FuncoesUteis.verificarCpf(aluno.getCpf()));
        System.out.println("IMC: " + FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura()));
        System.out.println("Status do aluno: ");

        // Avaliando o aluno
        double nota = aluno.getNota();  // Nota já é double
        double presenca = aluno.getPercentualPresenca();
        System.out.println("Resultado da avaliação: " + FuncoesUteis.avaliarAluno(nota, presenca));
    }
}
