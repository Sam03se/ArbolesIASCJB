package modelo;

public class CondicionUbicacion implements Condicion {
    private String ubicacionEsperada;

    public CondicionUbicacion(String ubicacionEsperada) {
        this.ubicacionEsperada = ubicacionEsperada;
    }

    @Override
    public boolean evaluar(Datos datos) {
        return ubicacionEsperada.equals(datos.ubicacion);
    }

    @Override
    public String descripcion() {
        return "Ubicación == " + ubicacionEsperada;
    }
}
