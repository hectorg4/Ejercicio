
package ejercicioJR;

public class moto2 {
    String marca;
    String modelo;
    int cilindrada;
    int precio;
    
public moto2(){
    marca="Yamaha";
    modelo="YBR";
    cilindrada=160;
    precio=80500050;
    
 }
public String datos_moto2(){
        return "La marca de la moto es "+ marca +" , su modelo es " + modelo + 
                " , tiene una cilindrada  de  " + cilindrada + " C " + 
                " y el precio" + " de venta es $ " + precio ;
    }
    
}



