package vehiculos;
import java.util.ArrayList;

public class Pais {
    int vendidos;
    static  ArrayList<Pais> ArrayPaises= new ArrayList<>();
    private String nombre;
    public  Pais(String nombre){
        this.nombre=nombre;
        ArrayPaises.add(this);
    }
    
    public Pais(){
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return  nombre;
    }
    
    public static Pais paisMasVendedor(){
        int mayor = 0;
        for(Pais pais : ArrayPaises){
            if (pais.vendidos > mayor){
                mayor = pais.vendidos;
            }
        }
        Pais paisMasVentas = new Pais();
        for(Pais pais : ArrayPaises){
            if(pais.vendidos == mayor){
                paisMasVentas = pais;
            }
        }
        return paisMasVentas;
    }

}