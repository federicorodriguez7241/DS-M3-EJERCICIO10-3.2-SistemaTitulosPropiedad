public class TituloCaba implements TituloPropiedad {
    private final String nombreTitular;
    private final String dniTitular;
    private final String partidaInmobiliaria;
    private final double valuacionFiscal;
    private final String codigoNotarial;
    private final String firmaDigital;

    public TituloCaba(String nombreTitular, String dniTitular, String partidaInmobiliaria,
                      double valuacionFiscal, String codigoNotarial, String firmaDigital) {
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.partidaInmobiliaria = partidaInmobiliaria;
        this.valuacionFiscal = valuacionFiscal;
        this.codigoNotarial = codigoNotarial;
        this.firmaDigital = firmaDigital;
    }

    @Override
    public String generarDocumentoOficial() {
        return "[TITULO ELECTRONICO - RPI CABA]\n"
                + "Propietario: " + nombreTitular + " (DNI: " + dniTitular + ")\n"
                + "Partida Inmobiliaria: " + partidaInmobiliaria + " | Valuacion Fiscal: $" + valuacionFiscal + "\n"
                + "Actuacion Notarial Nro: " + codigoNotarial + "\n"
                + "Firma Digital Gubernamental: " + firmaDigital;
    }

    @Override
    public void registrarTitulo() {
        System.out.println("=== INSCRIPCION EN REGISTRO PROPIEDAD INMUEBLE CABA ===");
        System.out.println(generarDocumentoOficial());
        System.out.println("Estado: PROTOCOLIZADO Y REGISTRADO\n");
    }
}