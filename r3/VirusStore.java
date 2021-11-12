package r3;

import java.util.ArrayList;
public class VirusStore {
    
    public static ArrayList<String> tipos  (ArrayList<String> listado_categorias){
    ArrayList<String>resultado = new ArrayList<>();
    for (String elemento : listado_categorias){
    if (!resultado.contains(elemento)){
        resultado.add(elemento);
   
     }
    }
    return resultado;
    }

    public static ArrayList<Integer> buscar  (ArrayList<Integer> inventario_tienda, ArrayList<String>listado_categorias, String categoria_buscada){
    ArrayList<Integer>resultado2 = new ArrayList<>();
    for (int elemento : inventario_tienda){
    if (listado_categorias.get(elemento).equals(categoria_buscada)){
        resultado2.add(elemento);
    }
    
    }
    return resultado2;
    }
    
    public static ArrayList<Integer> vender (ArrayList<Integer> inventario_tienda, ArrayList<Integer> comprador){
    ArrayList<Integer>resultado3 = new ArrayList<>();
    for (int i = 0; i <inventario_tienda.size(); i ++){
    if(!comprador.contains(inventario_tienda.get(i)))
    {
        resultado3.add(inventario_tienda.get(i));
    }
    }
    return resultado3;
    }

    public static Integer intercambiar (ArrayList<Integer> inventario_tienda, ArrayList<Integer> otra_tienda){
    int conteo = 0;
    int conteo2= 0;
    for (int i = 0; i<otra_tienda.size(); i++){
    if(!inventario_tienda.contains(otra_tienda.get(i)))
        {
        conteo2++;
        }
    }
    for (int i= 0 ; i < inventario_tienda.size(); i++)
    {
        if(!otra_tienda.contains(inventario_tienda.get(i)))
        {
            conteo++;
        }
    }
    return (conteo<=conteo2)?conteo:conteo2;
    }
}
