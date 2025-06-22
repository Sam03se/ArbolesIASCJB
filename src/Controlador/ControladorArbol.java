package Controlador;

import modelo.*;

public class ControladorArbol {
    private Nodo raiz;

    public ControladorArbol() {
        construirArbol();
    }

    private void construirArbol() {
        // Nodo hoja: Aprobado joven solvente
        Nodo aprobadoJoven = new Nodo("Aprobado - perfil joven solvente");
        // Nodo hoja: Aprobado maduro solvente
        Nodo aprobadoMaduro = new Nodo("Aprobado - perfil maduro solvente");
        // Nodo hoja: Aprobado por antigüedad
        Nodo aprobadoAntiguedad = new Nodo("Aprobado - solvente por estabilidad");
        // Nodo hoja: Rechazado
        Nodo rechazado = new Nodo("Rechazado - perfil riesgoso");

        // Nodo de decisión: edad < 30
        Nodo nodoEdad = new Nodo(new CondicionEdadMenor(30), aprobadoJoven, aprobadoMaduro);
        // Nodo de decisión: antigüedad laboral > 5
        Nodo nodoAntiguedad = new Nodo(new CondicionAntiguedadMayor(5), aprobadoAntiguedad, rechazado);
        // Nodo de decisión raíz: ingreso > 50,000
        raiz = new Nodo(new CondicionIngresoMayor(50000), nodoEdad, nodoAntiguedad);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
