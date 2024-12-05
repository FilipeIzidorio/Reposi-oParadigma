package parte_1.factory;

import parte_1.exceptions.TipoCalculadoraNaoReconhecidoException;
import parte_1.interfaces.Calculadora;
import parte_1.models.TipoCalculadora;
import parte_1.services.CalculadoraBonus;
import parte_1.services.CalculadoraExtra;
import parte_1.services.CalculadoraSalario;

public class CalculadoraFactory {
    public static Calculadora getCalculadora(TipoCalculadora tipo) throws TipoCalculadoraNaoReconhecidoException {
        switch (tipo) {
            case SALARIO:
                return new CalculadoraSalario();
            case EXTRA:
                return new CalculadoraExtra();
            case BONUS:
                return new CalculadoraBonus();
            default:
                throw new TipoCalculadoraNaoReconhecidoException("Tipo de calculadora não reconhecido: " + tipo);
        }
    }
}