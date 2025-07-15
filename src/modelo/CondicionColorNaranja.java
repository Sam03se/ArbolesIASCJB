package modelo;

public class CondicionColorNaranja implements Condicion {

    @Override
    public boolean evaluar (Datos datos){
        return datos.formaFruta.equalsIgnoreCase("naranja");
    }
    @Override
    public String descripcion(){
        return("la fruta es de color naranja?");
    }

}
