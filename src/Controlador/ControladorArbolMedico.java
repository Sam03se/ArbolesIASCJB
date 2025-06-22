package Controlador;

import modelo.*;

public class ControladorArbolMedico {
    private Nodo raiz;

    public ControladorArbolMedico() {
        construirArbol();
    }

    private void construirArbol() {
        Nodo emergencia = new Nodo("Emergencia - Saturación baja");
        Nodo probableEnfermedad = new Nodo("Probable enfermedad");
        Nodo observacion = new Nodo("Posible observación");
        Nodo sano = new Nodo("Poco probable enfermedad");

        Nodo nodoSaturacion = new Nodo(new CondicionSaturacionMenor(90), emergencia, probableEnfermedad);
        Nodo nodoTos = new Nodo(new CondicionTos(), nodoSaturacion, observacion);
        raiz = new Nodo(new CondicionFiebre(), nodoTos, sano);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
