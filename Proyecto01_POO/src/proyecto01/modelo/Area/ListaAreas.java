/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import proyecto01.modelo.Elemento.Elemento;
import proyecto01.modelo.Elemento.ComponenteElemento;
import proyecto01.modelo.Elemento.ListaComponentes;
import proyecto01.modelo.Area.Area;
import proyecto01.modelo.Area.NivelPiso;
import java.util.ArrayList;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class ListaAreas {
    private ArrayList<Area> lista;

    public ListaAreas(){
        lista = new ArrayList<Area>(); 
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
            ListaComponentes componentes, String ubicacionGeneral, String codArea){
        if(!consultarElemento(codigo, codArea)){
            Area a = consultarAreaa(codArea);
            if(a != null){
                a.agregarElemento(new Elemento(codigo, nombre, descripcion, componentes, ubicacionGeneral));
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
}
