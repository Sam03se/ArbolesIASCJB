package Controlador;

import modelo.*;

public class ControladorArbolCredito {
    private Nodo raiz;

    public ControladorArbolCredito() {
        construirArbol();
    }

    private void construirArbol() {
        Nodo aprobado = new Nodo("Aprobado");
        Nodo rechazado = new Nodo("Rechazado");
        raiz = new Nodo(new CondicionIngresoMayor(50000), aprobado, rechazado);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
