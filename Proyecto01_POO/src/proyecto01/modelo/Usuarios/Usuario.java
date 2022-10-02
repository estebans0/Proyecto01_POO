package proyecto01.modelo.Usuarios;

import java.util.Objects;

public abstract class Usuario {
    
    // Atributos
    protected String id;
    protected String nombre;
    protected String correo;
    protected String contrasenna;
    protected String detalle;

    // Métodos
    public Usuario() {
        nombre = "No especificado";
        id = "No especificado";
        correo = "No especificado";
        contrasenna = "No especificado";
        detalle = "No especificado";
    }

    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenna() {
        return contrasenna;
    }
    
    public String getDetalle() {
        return detalle;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }

}
