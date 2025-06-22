package modelo;

public class CondicionFiebre implements Condicion {
    @Override
    public boolean evaluar(Datos datos) {
        return datos.fiebre;
    }

    @Override
    public String descripcion() {
        return "Fiebre == Sí";
    }
}
