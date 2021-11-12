package r2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Flix {
    public List<Producto> productos = new ArrayList<>();
        public void añadirProductos(Producto p){
        this.productos.add(p);
        }
    public Integer todoslosproductos(){
        return this.productos.size();
        }
    @Override
    public String toString(){
        String chao = "***Catálogo MisiónTicFLIX***";
        for (Producto p: this.productos){
        chao += "\n"+p.toString();
        }
        return chao;
    }
}

public class Catalogo {
    
public static void main(String[] args) {
        Flix flix = new Flix();
        Scanner sc = new Scanner(System.in);
        String datos = sc.nextLine();
     
    while (true) {
        if (datos.startsWith("1")) {
            String[] cosas = datos.split("&");
            String medio = cosas[1];
            String nombre = cosas[2];
            String genero = cosas[3];
            int anio = Integer.valueOf(cosas[4]);
            Double rating = Double.valueOf(cosas[5]);
            int beta = Integer.valueOf(cosas[6]);
            Producto producto = null;
            if (medio.equalsIgnoreCase("Película")) {
                producto = new Pelicula (nombre, genero, anio, rating, beta);
            } else if (medio.equalsIgnoreCase("Serie")) {
                producto = new Serie (nombre, genero, anio, rating, beta);
            }
            flix.añadirProductos(producto);
        } else if (datos.startsWith("2")) {
            System.out.println(flix.toString());
        } else if (datos.startsWith("3")) {
                break;
        }
            
            datos = sc.nextLine();
        }
    }
}
