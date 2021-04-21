package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    public int venta;

    public Fabricante(String nombre,Pais pais){
    	this.nombre = nombre;
    	this.pais = pais;
        fabricantes.add(this);
    }
    
    public Fabricante(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }
    
    public Pais getPais(){
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int cantMayor=0;
        for(Fabricante fabricante : fabricantes){
            if (fabricante.venta>cantMayor){
            	cantMayor=fabricante.venta;
            }
        }
        Fabricante fabricanteMayor = new Fabricante();
        for(Fabricante fabriMayor : fabricantes){
            if(fabriMayor.venta==cantMayor){
            fabricanteMayor=fabriMayor;
            }
        }
        return fabricanteMayor;
    }
}