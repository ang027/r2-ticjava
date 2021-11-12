package r2;
public class Serie extends Producto{
    public int temporadas;

    public Serie(String nombre, String genero, int anio, Double rating, int temporadas) {
        super(nombre, genero, anio, rating); 
        this.temporadas = temporadas;
    }
    @Override
    public String toString(){

    String info ="\t" +"Serie - nombre: "+ this.nombre + "\n";
        info +="\t" + "género: " + this.genero + "\n";
        info +="\t" + "año: "+this.anio + "\n";
        info +="\t" +"rating: "+this.rating + "\n";
        info +="\t" +"temporadas: "+this.temporadas;
        return info;
    }
}
