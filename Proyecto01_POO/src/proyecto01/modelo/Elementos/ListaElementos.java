package proyecto01.modelo.Elementos;

import java.util.ArrayList;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class ListaElementos {
    private ArrayList<Elemento> lista;
    
    public ListaElementos(){
        lista = new ArrayList<Elemento>();
    }
    public int cantidadElementos(){
        return lista.size();
    }
    
    public boolean consultarElemento(String codigo){
        for (Elemento elem: lista){
            if (elem.getCodigo().equalsIgnoreCase(codigo))
                return true;
        }
        return false;
    }
    
    public Elemento consultarElementoe(String codigo){
        for (Elemento elem: lista){
            if (elem.getCodigo().equalsIgnoreCase(codigo))
                return elem;
        }
        return null;
    }
    
    public boolean agregarElemento(String cod, String nombre,String descripcion, EstadoElemento estado, ListaComponentes componentes, String ubicacionGeneral){
        if (!consultarElemento(cod)){
             lista.add(new Elemento(cod,nombre, descripcion, estado, componentes, ubicacionGeneral));
            return true;
        }
       return false;
    }
    
    public boolean agregarElemento(Elemento nuevoElem){
        if (!consultarElemento(nuevoElem.getCodigo())){
             lista.add(nuevoElem);
            return true;
        }
       return false;
    }

    public boolean eliminarElemento(String cod){
        for(Elemento elem : lista){
            if(elem.getCodigo().equalsIgnoreCase(cod)){
                lista.remove(elem);
                return true;
            }
        }
        return false;
    }
    
    public String mostrarElementos(){
        String elems = "";
        for(Elemento elem :lista){
            elems += elem.toString();
        }
        return elems;    
    }
    
    public ArrayList<Elemento> elementosEstadoAceptable(){
        ArrayList<Elemento> aceptables = new  ArrayList<Elemento>();
        for(Elemento elem : lista){
            if (elem.getEstado() == EstadoElemento.Aceptable){
                aceptables.add(elem);
            }
        }
        return aceptables;
    }
    
    public ArrayList<Elemento> elementosEstadoDañoMedio(){
        ArrayList<Elemento> medios = new  ArrayList<Elemento>();
        for(Elemento elem : lista){
            if (elem.getEstado() == EstadoElemento.DañosMedios){
                medios.add(elem);
            }
        }
        return medios;
    }
    public ArrayList<Elemento> elementosEstadoDañoImportante(){
        ArrayList<Elemento> importantes = new  ArrayList<Elemento>();
        for(Elemento elem : lista){
            if (elem.getEstado() == EstadoElemento.DañosImportantes){
                importantes.add(elem);
            }
        }
        return importantes;
    }
}