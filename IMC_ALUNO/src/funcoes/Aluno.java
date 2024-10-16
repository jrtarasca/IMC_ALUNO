package src.funcoes;

public class Aluno extends Pessoa {

    private double percentualPresenca;
    private double nota;  
    // Construtor 
    public Aluno(String nome, String cpf, double peso, double altura, double percentualPresenca, double nota) {
        super(nome, cpf, peso, altura); // Chama o construtor da classe mãe
        this.percentualPresenca = percentualPresenca;
        this.nota = nota;
    }

    // Getters e setters para os atributos específicos de Aluno
    public double getPercentualPresenca() {
        return percentualPresenca;
    }

    public void setPercentualPresenca(double percentualPresenca) {
        this.percentualPresenca = percentualPresenca;
    }

    public double getNota() {
        return nota; 
    }

    public void setNota(double nota) {  
        this.nota = nota;
    }

}
