package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static  int cantidadVehiculos;


    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
        this.placa=placa;
        this.puertas=puertas;
        this.velocidadMaxima=velocidadMaxima;
        this.nombre=nombre;
        this.precio=precio;
        this.peso= peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
        cantidadVehiculos ++;
    }

    public Vehiculo() {
    }
    
    public void setPlaca(String placa){
        this.placa=placa;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPuertas(int puertas){
        this.puertas=puertas;
    }
    
    public int getPuertas(){
        return puertas;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio(int precio){
        this.precio=peso;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPeso(int peso){
        this.precio=peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setTraccion(String traccion){
        this.traccion=traccion;
    }
    
    public String getTraccion(){
        return  traccion;
    }
    
    public void setFabricante(Fabricante fabricante){
        this.fabricante=fabricante;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos=cantidadVehiculos;
    }
    
    public static String vehiculosPorTipo() {
        return "Automoviles: " + Automovil.fabricados+ "\n"+
                "Camionetas: " + Camioneta.fabricados + "\n" +
                "Camiones: " + Camion.fabricados;
    }

}