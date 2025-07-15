package modelo;

public class CondicionFormaRedonda implements Condicion {
    @Override
    public boolean evaluar (Datos datos){
        return datos.formaFruta.equalsIgnoreCase("redonda");
    }
    @Override
    public String descripcion(){
        return("la fruta es redonda?");
    }

}
