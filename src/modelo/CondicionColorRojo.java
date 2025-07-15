package modelo;

public class CondicionColorRojo implements Condicion {

    @Override
    public boolean evaluar (Datos datos){
        return datos.formaFruta.equalsIgnoreCase("rojo");
    }
    @Override
    public String descripcion(){
        return("la fruta es de color rojo?");
    }

}
