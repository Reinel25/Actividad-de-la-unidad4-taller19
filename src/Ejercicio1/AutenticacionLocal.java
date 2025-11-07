package Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return usuario.equals("admin") && contrasena.equals("1234");
    }
}
