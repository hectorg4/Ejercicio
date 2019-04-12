
package ejercicioJR;

public class moto1 {
    String marca;
    String modelo;
    int cilindrada;
    int precio;
    
public moto1(){
    marca="Honda";
    modelo="Titan";
    cilindrada=125;
    precio=6000000;
    
 }
public String datos_moto1(){
        return "La marca de la moto es "+ marca +" , su modelo es " + modelo + 
                " , tiene una cilindrada  de  " + cilindrada + " C " + 
                " y el precio" + " de venta es $ " + precio ;
    }
    
}
