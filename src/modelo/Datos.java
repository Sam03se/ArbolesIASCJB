package modelo;

public class Datos {
    public int edad;
    public double ingreso;
    public int antiguedadLaboral;
    public String ubicacion;
    public boolean fiebre;
    public boolean tos;
    public int saturacion;

    public Datos(int edad, double ingreso, int antiguedadLaboral, String ubicacion,
                 boolean fiebre, boolean tos, int saturacion) {
        this.edad = edad;
        this.ingreso = ingreso;
        this.antiguedadLaboral = antiguedadLaboral;
        this.ubicacion = ubicacion;
        this.fiebre = fiebre;
        this.tos = tos;
        this.saturacion = saturacion;
    }
}
