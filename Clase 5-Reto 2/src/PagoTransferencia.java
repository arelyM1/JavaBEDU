public class PagoTransferencia extends MetodoPago {
    private boolean validacionExterna;

    public PagoTransferencia(double monto, boolean validacionExterna) {
        super(monto);
        this.validacionExterna = validacionExterna;
    }

    @Override
    public boolean autenticar() {
        return validacionExterna;
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando pago por transferencia de $" + monto);
    }
}