
package clase.pkg1;

public class Clase1 {
    
    

    public static void main(String[] args) {
        
//        funcionesMatematicasSuma Funciones = new funcionesMatematicasSuma();
//        System.out.println(Funciones.Division());

        Coche miCarro = new Coche("TOYOTA", 2019, "ROJO");
        Coche tuCarro = new Coche("Nissan", 2019, "Azul");
        
        Coche carroConMasParametros = new Coche("Nissan", 2019, "Azul", 4);
        
        System.out.println(tuCarro.toString());
        System.out.println(miCarro.toString());
        
        System.out.println(carroConMasParametros.toString());
        
        
        




    
    }
    
    
    
}
