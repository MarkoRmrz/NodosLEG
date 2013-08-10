package co.edu.um.NodosLEG;

/**
 * Created with IntelliJ IDEA.
 * User: usuario
 * Date: 9/08/13
 * Time: 07:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Nodo<N> {
    N dato;
    Nodo<N> sgt;

    public Nodo(N dato){
        this(dato,null);
    }
    Nodo(N dato, Nodo<N>sgt){
        this.dato=dato;
        this.sgt=sgt;
    }

}
