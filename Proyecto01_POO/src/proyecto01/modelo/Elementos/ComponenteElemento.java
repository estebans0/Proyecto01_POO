package proyecto01.modelo.Elementos;

public class ComponenteElemento extends Elemento {
    private String descripcion;
    private String codigo;

    
    public ComponenteElemento (){
        super();
    }
    public ComponenteElemento(String codigo, String descripcion) {
        super();
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    @Override
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

    public String getUbicacionGeneral() {
        return super.ubicacionGeneral;
    }

    @Override
    public String toString() {
        return "ComponenteElemento{" + "\n"
                + "descripcion=" + descripcion +"\n"
                + ", codigo=" + codigo + '}'+"\n";
    }
    
}
