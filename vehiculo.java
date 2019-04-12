
package ejercicioJR;

public class vehiculo {
    String marca;
    int modelo;
    int puertas;
    int precio;
    
public vehiculo(){
    marca="Peugeot";
    modelo=208;
    puertas=5;
    precio=25000000;
    
 }
public String datos_vehiculo(){
        return "La marca del auto es "+ marca +" , su modelo es " + modelo + 
                " , tiene una cantidad de puertas de  " + puertas + " y el precio"
                + " de venta es $ " + precio ;
    
}

}
    

