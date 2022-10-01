package proyecto01.modelo.Areas;
import java.util.ArrayList;
import java.util.Objects;

import proyecto01.modelo.Elementos.Elemento;
import proyecto01.modelo.Elementos.EstadoElemento;
import proyecto01.modelo.Elementos.ListaComponentes;
import proyecto01.modelo.Elementos.ListaElementos;
/**
 *
 * @author Melissa Carvajal Ch
 */
public class Area {
    private String codigo;
    private String nombre;
    private String descripcion;
    private NivelPiso nivel;
    private  ListaElementos elementos;

    public Area(String codigo,String nombre, String descripcion, NivelPiso nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        elementos = new ListaElementos();
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

    public ListaElementos getElementos() {
        return elementos;
    }

    public void setElementos(ListaElementos elementos) {
        this.elementos = elementos;
    }
    
    public String mostrarElementos(){
        return elementos.mostrarElementos();
    }
    
    public void agregarElemento(Elemento elem){
        elementos.agregarElemento(elem);
    }
    
    public void agregarElemento(String codigo, String nombre, String descrip, EstadoElemento estado,ListaComponentes com, String ubic){
        elementos.agregarElemento(codigo, nombre, descrip,estado, com, ubic);
    }
    
    public boolean eliminarElemento(String codigo){
        if(elementos.consultarElemento(codigo)){
            elementos.eliminarElemento(codigo);
            return true;
        }
        return false;
    }
    public boolean consultarElemento(String codigo){
        return elementos.consultarElemento(codigo);
    }
    
    public Elemento consultarElementoe(String codigo){
        return elementos.consultarElementoe(codigo);
    }
    
   public ArrayList<Elemento> elementosEstadoAceptable(){
       return elementos.elementosEstadoAceptable();
   }
   
   public ArrayList<Elemento> elementosEstadoDañoMedio(){
       return elementos.elementosEstadoDañoMedio();
   }
   
   public ArrayList<Elemento> elementosEstadoDañoImportante(){
       return elementos.elementosEstadoDañoImportante();
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
                + " Elementos: " + mostrarElementos() + '}';
    }
    
    
}