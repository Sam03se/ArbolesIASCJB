package modelo;

public class CondicionAntiguedadMayor implements Condicion {
    private int umbral;

    public CondicionAntiguedadMayor(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return datos.antiguedadLaboral > umbral;
    }

    @Override
    public String descripcion() {
        return "Antigüedad laboral > " + umbral;
    }
}
