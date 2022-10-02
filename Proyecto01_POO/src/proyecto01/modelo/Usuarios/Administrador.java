package proyecto01.modelo.Usuarios;

public class Administrador extends Usuario {
    
    // Atributos
            
    // Métodos
    public Administrador(String id, String nombre, String contrasenna) {
        super();
        this.id = id; // AD0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombre= " + nombre + ", id= " + id + ", contrasenna= " + contrasenna + '}';
    }
    
}
