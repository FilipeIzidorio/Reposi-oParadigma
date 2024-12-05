package parte_1;

import parte_1.factory.CalculadoraFactory;
import parte_1.interfaces.Calculadora;
import parte_1.models.Funcionario;
import parte_1.models.TipoCalculadora;

public class Main {
    public static void main(String[] args) {
        try {
            Funcionario f1 = new Funcionario("Alice", 50.0, 160, 20, true);
            Funcionario f2 = new Funcionario("Bob", 40.0, 100, 50, true);
            Funcionario f3 = new Funcionario("Carol", 30.0, 180, 30, true);
            Funcionario f4 = new Funcionario("Dave", 20.0, 200, 10, false);
            Funcionario f5 = new Funcionario("Eve", 60.0, 220, 25, true);

            Calculadora calcSalario = CalculadoraFactory.getCalculadora(TipoCalculadora.SALARIO);
            Calculadora calcExtra = CalculadoraFactory.getCalculadora(TipoCalculadora.EXTRA);
            Calculadora calcBonus = CalculadoraFactory.getCalculadora(TipoCalculadora.BONUS);

            System.out.println("Salário de Alice: " + calcSalario.calcular(f1));
            System.out.println("Horas extras de Bob: " + calcExtra.calcular(f2));
            System.out.println("Bônus de Carol: " + calcBonus.calcular(f3));

            // Teste de exceção
            System.out.println("Salário de Dave: " + calcSalario.calcular(f4));

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
