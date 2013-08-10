package co.edu.um.NodosLEG;

/**
 * Created with IntelliJ IDEA.
 * User: usuario
 * Date: 9/08/13
 * Time: 07:13 PM
 * To change this template use File | Settings | File Templates.
 */
import org.junit.Test;

public class LEGTest {
    public static void main (){
        LEG<Integer> L= new LEG<Integer>();
        L.insertarNodo(new Integer(10));
        L.insertarNodo(new Integer(12));
        System.out.println("Lista de Nodos Actual:/n"+L.toString());
        System.out.println("Borrar de la lista el 10:");
        if (L.EliminarNodo(new Integer(10)))
            System.out.println("El nodo no existe");
    }
}
