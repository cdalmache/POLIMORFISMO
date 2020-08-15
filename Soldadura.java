/*
 * Implemente un algoritmo que me permita desplegar los detalles de soldadura,
cuya clase principal se denomina Soldadura y sus subclases se nombran como:
SoldaduraFsw, SoldaduraFrw y SoldaduraArco los mismos que usen los siguientes atributos:
 material de tipo cadena, longitud de tipo decimal,diametro de tipo decimal y masa_soldadura de tipo decimal.
Crear metodos que gestionen los atributos mencionados*/
package daniel.polimorfismotarea1;
/**
 *
 * @author Almache Cristian
 */

public class Soldadura{
   public void DetallarMaterial(){
     System.out.println(" Metales Ferrosos");
 } 
   public void IdentificarLongitud(){
       System.out.println("0");
   }
   public void IdentificarDiametro(){
       System.out.println("0");
   }
   public void Identificarmasa(){
       System.out.println("0");
   }
      
}
 // Subclase 1
     class SoldaduraFsw  extends Soldadura{
         public void DetallarMaterial(){
             System.out.println("Acero");
        }
     public void IdentificarLongitud(){
       System.out.print("  14.2");
         
  }
      public void IdentificarDiametro(){
       System.out.print("  .65");
   }
   public void Identificarmasa(){
       System.out.println("  45");
   }
     }

// Subclase 2
class SoldaduraFrw extends Soldadura{
    public void DetallarMaterial(){
        System.out.print("  Cobre");
    }
    public void IdentificarLongitud(){
       System.out.print("  15.8");
 }
     public void IdentificarDiametro(){
       System.out.print("  0.82");
   }
   public void Identificarmasa(){
       System.out.println("  48");
   }
    
}

// Subclase 3
class SoldaduraArco extends Soldadura{
    public void DetallarMaterial(){
        System.out.print("Aluminio");
    }
    public void IdentificarLongitud(){
       System.out.print("  16.3");
}
     public void IdentificarDiametro(){
       System.out.print("  0.15");
   }
   public void Identificarmasa(){
       System.out.print("  25");
   }
}

  class polimorfismotarea1{         
    public  static void main(String[] args){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("POLIMORFISMO TAREA 1 ");
         System.out.println("_________________________________________________________________");
         System.out.println("_________________________________________________________________");
    
        Soldadura Objeto1= new SoldaduraFsw();
        Soldadura Objeto2= new SoldaduraFrw();
        Soldadura Objeto3= new SoldaduraArco();
        
         //Outputs  Acero
         System.out.println("Proceso de soldar matales ferrosos: SoldaduraFsw");
          Objeto1.DetallarMaterial();
          Objeto1.IdentificarLongitud();
          Objeto1.IdentificarDiametro();
          Objeto1.Identificarmasa();
           //  //Outputs  Cobre
         System.out.println("Proceso de soldar matales cuprosos: SoldaduraFrw");
         Objeto2.DetallarMaterial();
         Objeto1.IdentificarLongitud();
          Objeto1.IdentificarDiametro();
          Objeto1.Identificarmasa();
         //Outputs  Acero
         System.out.println("Proceso de soldar matales aluminicos: SoldaduraArco");
         Objeto3.DetallarMaterial();
             
          Objeto1.IdentificarLongitud();
          Objeto1.IdentificarDiametro();
          Objeto1.Identificarmasa();
         //
    }
    
}
