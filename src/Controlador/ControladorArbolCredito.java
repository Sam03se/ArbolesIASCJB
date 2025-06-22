package Controlador;

import modelo.*;

public class ControladorArbolCredito {
    private Nodo raiz;

    public ControladorArbolCredito() {
        construirArbol();
    }

    private void construirArbol() {
        Nodo aprobadoJoven = new Nodo("Aprobado - perfil joven solvente");
        Nodo aprobadoMaduro = new Nodo("Aprobado - perfil maduro solvente");
        Nodo aprobadoAntiguedad = new Nodo("Aprobado - solvente por estabilidad");
        Nodo rechazado = new Nodo("Rechazado - perfil riesgoso");

        Nodo nodoEdad = new Nodo(new CondicionEdadMenor(30), aprobadoJoven, aprobadoMaduro);
        Nodo nodoAntiguedad = new Nodo(new CondicionAntiguedadMayor(5), aprobadoAntiguedad, rechazado);

        // 👑 CAMBIO AQUÍ: umbral de 600
        raiz = new Nodo(new CondicionIngresoMayor(600), nodoEdad, nodoAntiguedad);
    }

    public String procesarPrediccion(Datos datos) {
        StringBuilder trazabilidad = new StringBuilder();
        raiz.predecir(datos, trazabilidad);
        return trazabilidad.toString();
    }
}
