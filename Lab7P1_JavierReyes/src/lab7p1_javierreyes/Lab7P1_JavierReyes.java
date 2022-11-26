
package lab7p1_javierreyes;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Lab7P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lea = new Scanner(System.in); 
        // TODO code application logic here
       boolean salir = false;
       int opcion;
       while(!salir){
           System.out.println("Bienvenido al menu de laboratorio 7");
           System.out.println("las opciones del menu son las siguientes");
           System.out.println("1. El calamar pablo ");
           System.out.println("2. Torre de control ");
           System.out.println("3. Salir ");
           opcion = lea.nextInt();
           switch (opcion){
               case 1:
                   System.out.println("");
                   el_calamar_pablo();
                   break;
               case 2:
                   System.out.println("");
                   torre_de_control();
                   break;
      
                   case 3:
                   salir=true;
               break;
           }  
       }  
        System.out.println("Gracias por haber utilizado el menu del laboratorio");
        System.out.println("fin del menu"); 
    }
    
      public static void el_calamar_pablo(){      
      Scanner entrada = new Scanner(System.in);
      System.out.println("selecciono el calamar pablo");
      elcalamarpablo a = new elcalamarpablo();
              
      
      
      
      
      
      
      
      
      
      
      
      System.out.println(""); 
    }    
      public static void torre_de_control(){
      Scanner alo = new Scanner(System.in);
      System.out.println("selecciono torre de control");
      torre_de_control e = new torre_de_control("grupo");
          System.out.println("el modelo es: "+modelo);  
        
        
     
    
        
        
        
        System.out.println("");   
    }
     

    
}
