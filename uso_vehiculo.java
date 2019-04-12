
package ejercicioJR;


public class uso_vehiculo {
    public static void main(String[] args){
        
        auto mi_auto = new auto();
        System.out.println(mi_auto.datos_auto());
        
        moto1 mi_moto = new moto1();
        System.out.println(mi_moto.datos_moto1());
        
        vehiculo mi_vehiculo = new vehiculo();
        System.out.println(mi_vehiculo.datos_vehiculo());
        
        moto2 mi_moto2 = new moto2();
        System.out.println(mi_moto2.datos_moto2());
        
        System.out.println("El vehiculo mas caro es : " + mi_vehiculo.marca + " "
                + mi_vehiculo.modelo +
                " \nEl mas barato es : " + mi_moto.marca + " " + mi_moto.modelo + "\nEl vehiculo "
                + " que contiene en el modelo la letra 'Y' : " + mi_moto2.marca + " " +  
                mi_moto2.modelo + ", $  " + mi_moto2.precio);
    }
    
}
