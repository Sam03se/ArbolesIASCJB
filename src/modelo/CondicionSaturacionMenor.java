package modelo;

public class CondicionSaturacionMenor implements Condicion {
    private int umbral;

    public CondicionSaturacionMenor(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return datos.saturacion < umbral;
    }

    @Override
    public String descripcion() {
        return "Saturación < " + umbral;
    }
}
