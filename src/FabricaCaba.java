public class FabricaCaba extends FabricaTitulo {

    @Override
    public TituloPropiedad crearTitulo(SolicitudTitulo sol) {
        if (!validarDatosLegalesComunes(sol)) {
            return null;
        }

        // en CABA la partida inmobiliaria obligatoria tiene 7 digitos
        String partida = sol.getIdentificadorCatastral();
        if (partida == null || partida.length() != 7) {
            System.out.println("[CABA] Error: La Partida Inmobiliaria debe tener 7 digitos obligatorios.");
            return null;
        }

        String codigoNotarial = "ACT-CABA-2026-" + sol.getMatriculaEscribano();
        String firma = "RPI-CABA-" + Math.abs((partida + sol.getDniTitular()).hashCode());

        return new TituloCaba(
                sol.getNombreTitular(),
                sol.getDniTitular(),
                partida,
                sol.getValuacionFiscal(),
                codigoNotarial,
                firma
        );
    }
}
