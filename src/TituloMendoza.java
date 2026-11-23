public class TituloMendoza implements TituloPropiedad {
    private final String nombreTitular;
    private final String dniTitular;
    private final String padronTerritorial;
    private final double valuacionFiscal;
    private final String codigoNotarial;
    private final String firmaDigital;

    public TituloMendoza(String nombreTitular, String dniTitular, String padronTerritorial,
                         double valuacionFiscal, String codigoNotarial, String firmaDigital) {
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.padronTerritorial = padronTerritorial;
        this.valuacionFiscal = valuacionFiscal;
        this.codigoNotarial = codigoNotarial;
        this.firmaDigital = firmaDigital;
    }

    @Override
    public String generarDocumentoOficial() {
        return "[ESCRITURA DIGITAL - DGR MENDOZA]\n"
                + "Titular: " + nombreTitular + " (DNI: " + dniTitular + ")\n"
                + "Padron Territorial: " + padronTerritorial + " | Valuacion: $" + valuacionFiscal + "\n"
                + "Codigo Validacion Notarial: " + codigoNotarial + "\n"
                + "Sello Digital Registro Propiedad: " + firmaDigital;
    }

    @Override
    public void registrarTitulo() {
        System.out.println("=== INSCRIPCION EN REGISTRO DE LA PROPIEDAD DE MENDOZA ===");
        System.out.println(generarDocumentoOficial());
        System.out.println("Estado: INSCRIPTO Y FIRMADO DIGITALMENTE\n");
    }
}