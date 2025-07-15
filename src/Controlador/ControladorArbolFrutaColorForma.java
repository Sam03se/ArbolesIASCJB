package Controlador;

import modelo.*;

public class ControladorArbolFrutaColorForma {
    private Nodo raiz;

    public ControladorArbolFrutaColorForma() {
        construirArbol();
    }

    private void construirArbol() {
        Nodo nodoFinalManzana = new Nodo("Es una manzana 🍎");
        Nodo nodoFinalNaranja = new Nodo("Es una naranja 🍊");
        Nodo nodoDesconocida = new Nodo("No es ni manzana ni naranja 🍐");

        Nodo nodoColorNaranja = new Nodo(new CondicionColorNaranja(), nodoFinalNaranja, nodoDesconocida);
        Nodo nodoColorRojo = new Nodo(new CondicionColorRojo(), nodoFinalManzana, nodoColorNaranja);

        raiz = new Nodo(new CondicionFormaRedonda(), nodoColorRojo, nodoDesconocida);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
