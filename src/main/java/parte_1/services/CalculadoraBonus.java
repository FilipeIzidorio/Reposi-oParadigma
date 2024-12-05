package parte_1.services;

import parte_1.exceptions.FuncionarioInativoException;
import parte_1.interfaces.Calculadora;
import parte_1.models.Funcionario;

public class CalculadoraBonus implements Calculadora {
    @Override
    public double calcular(Funcionario funcionario) throws FuncionarioInativoException {
        if (!funcionario.isAtivo()) {
            throw new FuncionarioInativoException("Funcionário " + funcionario.getNome() + " está inativo.");
        }
        int totalHoras = funcionario.getHorasTrabalhadas() + funcionario.getHorasExtra();
        if (totalHoras > 200) {
            return (funcionario.getValorHora() * funcionario.getHorasTrabalhadas()) * 1.15;
        }
        return 0;
    }
}