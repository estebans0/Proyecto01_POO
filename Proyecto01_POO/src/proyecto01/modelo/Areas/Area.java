package proyecto01.modelo.Areas;


import java.util.ArrayList;
import java.util.Objects;

import proyecto01.modelo.Elementos.Elemento;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class Area {
    private String codigo;
    private String nombre;
    private String descripcion;
    private NivelPiso nivel;
    private  ArrayList<Elemento> elementos;

    public Area(String codigo,String nombre, String descripcion, NivelPiso nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        elementos = new ArrayList<Elemento>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public NivelPiso getNivel() {
        return nivel;
    }

    public void setNivel(NivelPiso nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
    
    public String mostrarElementos(){
        String e = "";
        for(int i = 0; i < elementos.size(); i++){
            Elemento elementoActual = elementos.get(i);
            e += elementoActual.toString();
        }
        return e;
    }
    
    public void agregarElemento(Elemento elem){
        elementos.add(elem);
    }
    
    public boolean eliminarElemento(String codigo){
        for(int i = 0; i < elementos.size(); i++){
            Elemento elementoActual = elementos.get(i);
            if (elementoActual.getCodigo().equals(codigo)){
               elementos.remove(i);
               return true;
            }
        }
        return false;
    }
    public boolean consultarElemento(String codigo){
        for(int i = 0; i < elementos.size(); i++){
            Elemento elementoActual = elementos.get(i);
            if (elementoActual.getCodigo().equals(codigo)){
                return true;
            } 
        }
        return false;
    }
    
    public Elemento consultarElementoe(String codigo){
        for(int i = 0; i < elementos.size(); i++){
            Elemento elementoActual = elementos.get(i);
            if (elementoActual.getCodigo().equals(codigo)){
                return elementoActual;
            } 
        }
        return null;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Area other = (Area) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Area{" + "\n"
                + " Codigo: " + codigo  +"\n"
                + " Nombre: " + nombre +"\n"
                + " Descripcion: " + descripcion +"\n"
                + " Nivel: " + nivel +"\n"
                + " Elementos: " + mostrarElementos() + '}'+"\n";
    }
    
    
}