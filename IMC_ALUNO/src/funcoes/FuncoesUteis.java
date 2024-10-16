package src.funcoes;

public class FuncoesUteis {

    // Método CPF 
    public static boolean verificarCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); 
        return cpf.length() == 11 && !cpf.matches("(\\d)\\1{10}"); // Verifica tamanho e repetição
    }

    // Método IMC
    public static double calcularIMC(double peso, double altura) {
        return (altura > 0) ? peso / (altura * altura) : 0;
    }

    // Método para avaliar 
    public static String avaliarAluno(double nota, double presenca) {
        return (nota >= 5 && presenca >= 75) ? "Aprovado" : "Reprovado";
    }
}
