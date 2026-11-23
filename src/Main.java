public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. EMISION DE TITULO EN MENDOZA ---");
        SolicitudTitulo solMendoza = new SolicitudTitulo(
                "MENDOZA", "38456123", "Mariana Lopez", "0501234567", "ESC-4412", 45000000
        );
        emitirYRegistrar(solMendoza);

        System.out.println("--- 2. EMISION DE TITULO EN CABA ---");
        SolicitudTitulo solCaba = new SolicitudTitulo(
                "CABA", "29874512", "Carlos Mendez", "1234567", "ESC-8890", 92000000
        );
        emitirYRegistrar(solCaba);

        System.out.println("--- 3. PROBANDO BLOQUEO POR DATOS OBLIGATORIOS FALTANTES ---");
        // padron de solo 4 digitos y sin matricula de escribano: la fabrica impide crear el titulo
        SolicitudTitulo solInvalida = new SolicitudTitulo(
                "MENDOZA", "40111222", "Pedro Gomez", "0501", "", 30000000
        );
        emitirYRegistrar(solInvalida);
    }

    private static void emitirYRegistrar(SolicitudTitulo solicitud) {
        FabricaTitulo fabrica = FabricaTitulo.obtenerFabrica(solicitud.getJurisdiccion());
        if (fabrica != null) {
            TituloPropiedad titulo = fabrica.crearTitulo(solicitud);
            if (titulo != null) {
                titulo.registrarTitulo();
            } else {
                System.out.println("Emision rechazada: la solicitud no cumple con las normas legales.\n");
            }
        }
    }
}