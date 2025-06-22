package modelo;

public class CondicionTos implements Condicion {
    @Override
    public boolean evaluar(Datos datos) {
        return datos.tos;
    }

    @Override
    public String descripcion() {
        return "Tos == Sí";
    }
}
