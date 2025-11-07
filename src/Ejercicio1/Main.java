package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(local);
        gestor1.iniciarSesion("admin", "1234");


        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(oauth);
        gestor2.iniciarSesion("usuario", "TOKEN-OAUTH");
    }
}
