
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ListaEnteros.Lista;
import java.util.Random;

/**
 *
 * @author Alfonso
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Random r;
        int d;
        Lista lista;
        int k;
        r=new Random(); 
        lista=new Lista(); // Crea una lista vacia
        k=Math.abs(r.nextInt()%55);//Numero de nodos
        //Se insertan elementos de la lista
        for(;k>0;k--){
            d=r.nextInt()%99;
            lista.insertarCabezaLista(d);   
        }
        //Recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();
        //Si la lista esta vacia o no esta vacia 
        System.out.println("\n ¿La lista esta vacia? "+ lista.vacio());
    } 
}
