
package ejercicioJR;


public class auto {
    String marca;
    int modelo;
    int puertas;
    int precio;
    
public auto(){
    marca="Peugeot";
    modelo=206;
    puertas=4;
    precio=20000000;
    
 }
public String datos_auto(){
        return "La marca del auto es "+ marca +" , su modelo es " + modelo + 
                " , tiene una cantidad de puertas de  " + puertas + " y su precio"
                + " de venta es $ " + precio ;
    
}

}

