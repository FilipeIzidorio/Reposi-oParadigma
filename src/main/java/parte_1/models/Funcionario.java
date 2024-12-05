package parte_1.models;

public class Funcionario {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;
    private int horasExtra;
    private boolean ativo;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas, int horasExtra, boolean ativo) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtra = horasExtra;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
