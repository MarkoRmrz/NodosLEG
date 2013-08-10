package co.edu.um.NodosLEG;

/**
 * Created with IntelliJ IDEA.
 * User: usuario
 * Date: 9/08/13
 * Time: 07:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG<N> {
    protected Nodo<N> primero; protected int tamaño;

    public LEG(){
        primero=null;
        tamaño=0;
    }

    public void insertarNodo(N dato){
        primero=new Nodo<N>(dato,primero);this.tamaño++;
    }

    public void insertarNodoencola(N dato){
        Nodo<N> Nf=new Nodo<N>(dato);this.tamaño++;
        Nodo<N> aux=primero;
        if(aux.sgt != null) aux = aux.sgt;
        aux.sgt=Nf;
    }

    public String Mostrar(){
        String res="";
        for(Nodo<N> aux=primero; aux != null; aux=aux.sgt)
            res += aux.dato.toString()+"/n";
        return res;
    }

    public boolean EliminarNodo(N dato){
        Nodo<N> aux= primero, ant=null; boolean res=false;
        while (aux != null && !aux.dato.equals(dato)){
            ant=aux; aux=aux.sgt;
        }
        if (aux != null){
            res=true; this.tamaño--;
            if (ant ==null) primero=aux.sgt;
            else ant.sgt=aux.sgt;
        }
        return res;
    }
}
