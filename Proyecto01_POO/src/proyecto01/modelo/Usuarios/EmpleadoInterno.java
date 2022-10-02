package proyecto01.modelo.Usuarios;

public class EmpleadoInterno extends Usuario{
    
    // Atributos
            
    // Métodos
    public EmpleadoInterno(String id, String nombre, String contrasenna, String correo) {
        super();
        this.id = id; // EI0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "EmpleadoInterno{" + "nombre= " + nombre + ", id= " + id + ", correo= " + correo + ", contrasenna= " + contrasenna + '}';
    }
    
}
