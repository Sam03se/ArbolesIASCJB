package modelo;

public class CondicionIngresoMayor implements Condicion {
    private double umbral;

    public CondicionIngresoMayor(double umbral) {
        this.umbral = umbral;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return datos.ingreso > umbral;
    }

    @Override
    public String descripcion() {
        return "Ingreso > " + umbral;
    }
}
