package proyecto01.modelo.Elementos;

import java.util.Objects;

/**
 *
 * @author Melissa Carvajal Ch
 */
public class Elemento {
    private String codigo;
    private String nombre;
    private String descripcion;
    private EstadoElemento estado;
    private ListaComponentes componentes;
    private String ubicacionGeneral;
    
    public Elemento(){}
    
    public Elemento(String codigo,String nombre, String descripcion, EstadoElemento estado, ListaComponentes componentes, String ubicacionGeneral) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado; 
        this.componentes = componentes;
        this.ubicacionGeneral = ubicacionGeneral;
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

    public EstadoElemento getEstado() {
        return estado;
    }

    public void setEstado(EstadoElemento estado) {
        this.estado = estado;
    }

    public ListaComponentes getComponentes() {
        return componentes;
    }

    public boolean agregarComponente(ComponenteElemento e){
        if (!componentes.consultarComponente(e.getCodigo())){
            componentes.agregarComponente(e);
        }
        return false;
    }

    public String getUbicacionGeneral() {
        return ubicacionGeneral;
    }

    public void setUbicacionGeneral(String ubicacionGeneral) {
        this.ubicacionGeneral = ubicacionGeneral;
    }

    @Override
    public String toString() {
        return "\n" + "     Codigo: " + codigo +"\n"
                + "     Nombre: "+ nombre +"\n"
                + "     Descripcion: " + descripcion +"\n"
                + "     Estado: " + estado +"\n"
                + "     Componentes:" + componentes.toString() +"\n"
                + "     UbicacionGeneral:"  + ubicacionGeneral + '}'
                +"\n";
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
        final Elemento other = (Elemento) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    
}