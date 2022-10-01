package proyecto01.modelo.Elementos;
/**
 *
 * @author Melissa Carvajal Ch
 */
public class ComponenteElemento {
    private String descripcion;
    private String codigo;
    private String ubicacion;

    public ComponenteElemento(String descripcion, String codigo, String ubicacion) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Componente del Elemento" + "\n"
                + "Descripcion: " + descripcion + "\n"
                + "Codigo:" + codigo + "\n"
                + "Ubicaion: " + ubicacion + "\n";
    }


    
}
