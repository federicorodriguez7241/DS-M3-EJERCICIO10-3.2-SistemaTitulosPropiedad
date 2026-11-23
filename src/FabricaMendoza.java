public class FabricaMendoza extends FabricaTitulo {

    @Override
    public TituloPropiedad crearTitulo(SolicitudTitulo sol) {
        if (!validarDatosLegalesComunes(sol)) {
            return null;
        }

        // en Mendoza el padron territorial obligatorio tiene 10 digitos
        String padron = sol.getIdentificadorCatastral();
        if (padron == null || padron.length() != 10) {
            System.out.println("[Mendoza] Error: El Padron Territorial debe tener 10 digitos obligatorios.");
            return null;
        }

        String codigoNotarial = "NOT-MZA-2026-" + sol.getMatriculaEscribano();
        String firma = "DGR-MZA-" + Math.abs((padron + sol.getDniTitular()).hashCode());

        return new TituloMendoza(
                sol.getNombreTitular(),
                sol.getDniTitular(),
                padron,
                sol.getValuacionFiscal(),
                codigoNotarial,
                firma
        );
    }
}