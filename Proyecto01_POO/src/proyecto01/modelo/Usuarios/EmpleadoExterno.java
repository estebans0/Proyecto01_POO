package proyecto01.modelo.Usuarios;

public class EmpleadoExterno extends Usuario{
    
    // Atributos
            
    // Métodos
    public EmpleadoExterno(String id, String nombre, String contrasenna, String correo, String detalle) {
        super();
        this.id = id; // EE0
        this.nombre = nombre;
        this.contrasenna = contrasenna;
        this.correo = correo;
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "EmpleadoExterno{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + ", correo= " + correo + ", detalle= " + detalle + '}';
    }

}
