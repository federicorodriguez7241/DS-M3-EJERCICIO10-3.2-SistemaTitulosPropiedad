public class SolicitudTitulo {
    private final String jurisdiccion;
    private final String dniTitular;
    private final String nombreTitular;
    private final String identificadorCatastral; // Padron en Mendoza, Partida en CABA
    private final String matriculaEscribano;
    private final double valuacionFiscal;

    public SolicitudTitulo(String jurisdiccion, String dniTitular, String nombreTitular,
                           String identificadorCatastral, String matriculaEscribano, double valuacionFiscal) {
        this.jurisdiccion = jurisdiccion;
        this.dniTitular = dniTitular;
        this.nombreTitular = nombreTitular;
        this.identificadorCatastral = identificadorCatastral;
        this.matriculaEscribano = matriculaEscribano;
        this.valuacionFiscal = valuacionFiscal;
    }

    public String getJurisdiccion() { return jurisdiccion; }
    public String getDniTitular() { return dniTitular; }
    public String getNombreTitular() { return nombreTitular; }
    public String getIdentificadorCatastral() { return identificadorCatastral; }
    public String getMatriculaEscribano() { return matriculaEscribano; }
    public double getValuacionFiscal() { return valuacionFiscal; }
}
