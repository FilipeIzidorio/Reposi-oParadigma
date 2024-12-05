package parte_1.exceptions;

public class TipoCalculadoraNaoReconhecidoException extends Exception {
    public TipoCalculadoraNaoReconhecidoException(String message) {
        super(message);
    }
}