package modelo;

public class CondicionMetrosMayor implements Condicion {
    private int umbral;

    public CondicionMetrosMayor(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return datos.ingreso > umbral; // usamos ingreso para metros
    }

    @Override
    public String descripcion() {
        return "Metros cuadrados > " + umbral;
    }
}
