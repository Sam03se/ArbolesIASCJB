package modelo;

public class CondicionEdadMenor implements Condicion {
    private int umbral;

    public CondicionEdadMenor(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return datos.edad < umbral;
    }

    @Override
    public String descripcion() {
        return "Edad < " + umbral;
    }
}
