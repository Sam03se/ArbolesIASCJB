package modelo;

public interface Condicion {
    boolean evaluar(Datos datos);
    String descripcion();  // Para trazabilidad: explica qué evalúa
}
