package Ejercicio2;

public class ReportePDF implements GeneradorReporte {

    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte en PDF...");
        System.out.println("Contenido del reporte: " + contenido);
    }
}
