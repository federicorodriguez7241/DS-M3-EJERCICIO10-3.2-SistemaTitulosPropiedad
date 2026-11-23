public abstract class FabricaTitulo {

    public abstract TituloPropiedad crearTitulo(SolicitudTitulo solicitud);

    // validacion de identidad y datos legales basicos compartidos
    protected boolean validarDatosLegalesComunes(SolicitudTitulo sol) {
        if (sol == null) {
            return false;
        }
        if (sol.getNombreTitular() == null || sol.getNombreTitular().isEmpty()) {
            System.out.println("Error Legal: Falta el nombre completo del titular.");
            return false;
        }
        if (sol.getDniTitular() == null || (sol.getDniTitular().length() != 7 && sol.getDniTitular().length() != 8)) {
            System.out.println("Error Legal: El DNI del titular debe tener 7 u 8 digitos.");
            return false;
        }
        if (sol.getMatriculaEscribano() == null || sol.getMatriculaEscribano().isEmpty()) {
            System.out.println("Error Legal: Falta la matricula del escribano interviniente.");
            return false;
        }
        if (sol.getValuacionFiscal() <= 0) {
            System.out.println("Error Legal: La valuacion fiscal del inmueble debe ser mayor a cero.");
            return false;
        }
        return true;
    }

    public static FabricaTitulo obtenerFabrica(String jurisdiccion) {
        if (jurisdiccion == null) {
            return null;
        }
        if (jurisdiccion.equalsIgnoreCase("MENDOZA")) {
            return new FabricaMendoza();
        } else if (jurisdiccion.equalsIgnoreCase("CABA")) {
            return new FabricaCaba();
        }
        System.out.println("Error: Jurisdiccion registral no soportada (" + jurisdiccion + ")");
        return null;
    }
}