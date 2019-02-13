
package boletin_23;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_23 {

    
    public static void main(String[] args) {
      //Xeramos a lista
        ArrayList<Persona> cola= new ArrayList();
        //Xeramos unha cola
        xerarCola(cola);
        // Variables extra
        double recaudacion;
        double recaudacionTotal=0;
        Persona espectadorCola;
        int pIdade = 0;
        
        
        
        //Recorremos
         //Creamos el iterator
        Iterator<Persona> it=cola.iterator();
         
         
        //Recorremos a cola
        while(it.hasNext()){
             
            espectadorCola=it.next();
            pIdade=espectadorCola.getIdade();
             
            
            if(pIdade>=5 && pIdade<=10){ recaudacion=1; 
            }else if(pIdade>=11 && pIdade<=17){
                recaudacion=2.5;
            }else{
                recaudacion=3.5;
            }
             
            recaudacionTotal+=recaudacion;
             
            System.out.println("Unha persona de "+pIdade+" anos se lle ha cobraron " +recaudacion+ " euros");
             
        }
         
        
        System.out.println("La recaudación es de "+recaudacionTotal+" euros");
         
    }
     
    public static void xerarCola(ArrayList<Persona> cola){
             
        int numeroPersonas=xeraNumeroAleatorio(1,50);
         
        for(int i=0;i<numeroPersonas;i++){
            cola.add(new Persona(xeraNumeroAleatorio(5, 60)));
        } 
    }
     
   
    public static int xeraNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    
   
    } 
    }


