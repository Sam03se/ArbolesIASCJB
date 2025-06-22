package modelo;

public class Nodo {
    private Condicion condicion;
    private Nodo hijoSi;
    private Nodo hijoNo;
    private String resultado;  // Si es un nodo hoja, contiene el resultado

    // Nodo de decisión
    public Nodo(Condicion condicion, Nodo hijoSi, Nodo hijoNo) {
        this.condicion = condicion;
        this.hijoSi = hijoSi;
        this.hijoNo = hijoNo;
    }

    // Nodo hoja
    public Nodo(String resultado) {
        this.resultado = resultado;
    }

    // Método principal de predicción con trazabilidad
    public String predecir(Datos datos, StringBuilder trazabilidad) {
        if (resultado != null) {
            trazabilidad.append("Resultado final: ").append(resultado).append("\n");
            return resultado;
        }
        boolean eval = condicion.evaluar(datos);
        trazabilidad.append("Evaluando: ").append(condicion.descripcion())
                .append(" -> ").append(eval ? "Sí" : "No").append("\n");
        if (eval) {
            return hijoSi.predecir(datos, trazabilidad);
        } else {
            return hijoNo.predecir(datos, trazabilidad);
        }
    }
}
