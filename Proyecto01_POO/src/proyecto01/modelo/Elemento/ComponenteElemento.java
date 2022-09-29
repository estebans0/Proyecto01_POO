/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import proyecto01.modelo.Elemento.Elemento;
import proyecto01.modelo.Elemento.ComponenteElemento;
import proyecto01.modelo.Elemento.ListaComponentes;
import proyecto01.modelo.Area.Area;
import proyecto01.modelo.Area.NivelPiso;

/**
 *
 * @author Melissa Carvajal Ch
 */
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
    
}
