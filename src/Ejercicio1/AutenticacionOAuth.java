package Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Simulación de autenticación usando OAuth
        return contrasena.equals("TOKEN-OAUTH");
    }
}
