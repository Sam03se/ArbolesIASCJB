package Controlador;

import modelo.*;

public class ControladorArbolInmueble {
    private Nodo raiz;

    public ControladorArbolInmueble() {
        construirArbol();
    }

    private void construirArbol() {
        Nodo precioAlto = new Nodo("Precio: 150,000");
        Nodo precioMedio = new Nodo("Precio: 120,000");
        Nodo precioBajoUrbana = new Nodo("Precio: 100,000");
        Nodo precioBajoRural = new Nodo("Precio: 80,000");

        Nodo nodoUbicacionGrande = new Nodo(new CondicionUbicacion("urbana"), precioAlto, precioMedio);
        Nodo nodoUbicacionPequeño = new Nodo(new CondicionUbicacion("urbana"), precioBajoUrbana, precioBajoRural);

        raiz = new Nodo(new CondicionMetrosMayor(100), nodoUbicacionGrande, nodoUbicacionPequeño);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
