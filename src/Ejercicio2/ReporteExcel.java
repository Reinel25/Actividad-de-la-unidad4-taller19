package Ejercicio2;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte en Excel...");
        System.out.println("Contenido del reporte: " + contenido);
    }
}
