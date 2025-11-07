package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestor = new GestorReportes(reportePDF);
        gestor.generarReporte("Reporte de ventas octubre");

        GeneradorReporte reporteExcel = new ReporteExcel();
        gestor = new GestorReportes(reporteExcel);
        gestor.generarReporte("Reporte de inventario noviembre");
    }
}
