package parte_1.services;

import parte_1.exceptions.FuncionarioInativoException;
import parte_1.interfaces.Calculadora;
import parte_1.models.Funcionario;

public class CalculadoraExtra implements Calculadora {
    @Override
    public double calcular(Funcionario funcionario) throws FuncionarioInativoException {
        if (!funcionario.isAtivo()) {
            throw new FuncionarioInativoException("Funcionário " + funcionario.getNome() + " está inativo.");
        }
        return funcionario.getValorHora() * funcionario.getHorasExtra();
    }
}