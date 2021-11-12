package r2;
public abstract class Producto {
    
    public String nombre;
    public String genero;
    public int anio;
    public Double rating;
            
    Producto (String nombre, String genero, int anio, Double rating){
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.rating = rating;
            
    }
}
