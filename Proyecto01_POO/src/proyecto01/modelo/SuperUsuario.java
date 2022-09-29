package proyecto01.modelo;

public class SuperUsuario extends Usuario {
    
    // Atributos
    
    // Métodos
    public SuperUsuario() {
        super();
        nombre = "SuperUsuario";
        id = "SU0";
        contrasenna = "1234";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public void crearUsuario() { //Falta
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + '}';
    }

}
