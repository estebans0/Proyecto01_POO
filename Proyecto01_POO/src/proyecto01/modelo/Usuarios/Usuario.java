package proyecto01.modelo.Usuarios;

import java.util.Objects;

public abstract class Usuario {
    
    // Atributos
    protected String nombre;
    protected String id;
    protected String correo;
    protected String contrasenna;

    // Métodos 
    public Usuario() {
        nombre = "No especificado";
        id = "No especificado";
        correo = "No especificado";
        contrasenna = "No especificado";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
    

    public String getContrasenna() {
        return contrasenna;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", id=" + id + 
                ", correo=" + correo + ", contrasenna=" + contrasenna + '}';
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
