package proyecto01.control;

import java.util.ArrayList;

import proyecto01.modelo.Areas.Area;
import proyecto01.modelo.Areas.NivelPiso;
import proyecto01.modelo.Elementos.Elemento;
import proyecto01.modelo.Elementos.EstadoElemento;
import proyecto01.modelo.Elementos.ListaComponentes;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class ListaAreas {
    private ArrayList<Area> lista;

    public ListaAreas(){
        lista = new ArrayList<Area>(); 
    }

    public int cantidadAreas(){
        return lista.size();
    }
    
    public boolean consultarArea(String codigo){
        for (Area area: lista){
            if (area.getCodigo().equalsIgnoreCase(codigo))
                return true;
        }
        return false;
    }
    
    public Area consultarAreaa(String codigo){
        for (Area area: lista){
            if (area.getCodigo().equalsIgnoreCase(codigo))
                return area;
        }
        return null;
    }
    
    public boolean consultarElemento(String codElem, String codArea){
        if(consultarArea(codArea)){
            Area area = consultarAreaa(codArea);
            return area.consultarElemento(codElem);
        }
        return false;
    }
    
    public Elemento consultarElementoe(String codElem, String codArea){
        if(consultarArea(codArea)){
            Area area = consultarAreaa(codArea);
            return area.consultarElementoe(codElem);
        }
        return null;
    }
    
    public boolean agregarArea(String cod, String nombre,String descripcion, NivelPiso nivel){
        if (!consultarArea(cod)){
             lista.add(new Area(cod,nombre, descripcion, nivel));
            return true;
        }
       return false;
    }
    
    public boolean agregarArea(Area nuevaArea){
        if (!consultarArea(nuevaArea.getCodigo())){
             lista.add(nuevaArea);
            return true;
        }
       return false;
    }    
    
    public boolean agregarElemento(String codigo,String nombre, String descripcion,
           EstadoElemento estado, ListaComponentes componentes, String ubicacionGeneral, String codArea){
        if(!consultarElemento(codigo, codArea)){
            Area a = consultarAreaa(codArea);
            if(a != null){
                a.agregarElemento(new Elemento(codigo, nombre, descripcion,estado, componentes, ubicacionGeneral));
                return true;
            }
        }
        return false;
    }
    
    public boolean agregarElemento(Elemento e, String codArea){
        if(!consultarElemento(e.getCodigo(), codArea)){
            Area a = consultarAreaa(codArea);
            if (a != null){
                a.agregarElemento(e);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarElemento(String codElem, String codArea){
        Area a = consultarAreaa(codArea);
        if (a!= null && a.consultarElemento(codElem)){
           return a.eliminarElemento(codElem);
            
        }
        return false;
    }
    
    public String mostrarAreas(){
        String a = "";
        for(int i = 0; i<lista.size();i++){
            Area areaActual = lista.get(i);
            a += areaActual.toString();
        }
        return a;
    }
    public String mostrarElementos(){
        String elems="";
        for(Area area: lista){
            elems += area.mostrarElementos();
        }
        return elems;
    }
    public ArrayList<Elemento> elementosEstadoAceptable(){
        ArrayList<Elemento> aceptables = new  ArrayList<Elemento>();
        for(Area area :lista){
            if(!area.elementosEstadoAceptable().isEmpty())
                aceptables.addAll(area.elementosEstadoAceptable());
        }
        return aceptables;
    }
    public ArrayList<Elemento> elementosEstadoDañoMedio(){
        ArrayList<Elemento> medios = new  ArrayList<Elemento>();
        for(Area area :lista){
            if(!area.elementosEstadoAceptable().isEmpty())
                medios.addAll(area.elementosEstadoDañoMedio());
        }
        return medios;
    }
    public ArrayList<Elemento> elementosEstadoDañoImportante(){
        ArrayList<Elemento> importante = new  ArrayList<Elemento>();
        for(Area area :lista){
            if(!area.elementosEstadoAceptable().isEmpty())
                importante.addAll(area.elementosEstadoDañoImportante());
        }
        return importante;
    }
        
    
}
