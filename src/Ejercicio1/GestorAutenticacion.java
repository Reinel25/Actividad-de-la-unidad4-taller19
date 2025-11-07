package Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        if (servicioAutenticacion.autenticar(usuario, contrasena)) {
            System.out.println("Usuario autenticado correctamente");
        } else {
            System.out.println("Error de autenticación");
        }
    }
}
