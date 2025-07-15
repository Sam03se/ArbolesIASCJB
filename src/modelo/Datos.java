package modelo;

public class Datos {
    public int edad;
    public double ingreso;
    public int antiguedadLaboral;
    public String ubicacion;
    public boolean fiebre;
    public boolean tos;
    public int saturacion;

    public boolean esRedonda;
    public boolean tieneSemillas;
    public boolean esJugosa;

    public String colorFruta;
    public String formaFruta;

    // Constructor completo (usado en árboles anteriores)
    public Datos(int edad, double ingreso, int antiguedadLaboral, String ubicacion,
                 boolean fiebre, boolean tos, int saturacion,
                 boolean esRedonda, boolean tieneSemillas, boolean esJugosa,
                 String colorFruta, String formaFruta) {
        this.edad = edad;
        this.ingreso = ingreso;
        this.antiguedadLaboral = antiguedadLaboral;
        this.ubicacion = ubicacion;
        this.fiebre = fiebre;
        this.tos = tos;
        this.saturacion = saturacion;
        this.esRedonda = esRedonda;
        this.tieneSemillas = tieneSemillas;
        this.esJugosa = esJugosa;
        this.colorFruta = colorFruta;
        this.formaFruta = formaFruta;
    }

    public Datos(String colorFruta, String formaFruta) {
        this.colorFruta = colorFruta;
        this.formaFruta = formaFruta;
    }
}
