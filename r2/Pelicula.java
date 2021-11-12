package r2;
public class Pelicula extends Producto{
    public int duracion;
    
    public Pelicula (String nombre, String genero, int anio, Double rating, int duracion) {
        super(nombre, genero, anio, rating);
        this.duracion = duracion;
    }
    @Override
    public String toString(){
        String info ="\t" +"Película - nombre: "+ this.nombre + "\n";
        info +="\t" + "género: " + this.genero + "\n";
        info +="\t" + "año: "+this.anio + "\n";
        info +="\t" +"rating: "+this.rating + "\n";
        info +="\t" +"duración: "+this.duracion;
        return info;
    }
}