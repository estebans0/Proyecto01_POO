package proyecto01.modelo.Usuarios;

public class SuperUsuario extends Usuario {
    
    // Atributos
    
    // Métodos
    public SuperUsuario() {
        super();
        id = "SU0";
        nombre = "SuperUsuario";
        contrasenna = "1234";
    }

    @Override
    public String toString() {
        return "SuperUsuario{" + "nombre= " + nombre + ", id= " + id + ", contrasenna= " + contrasenna + '}';
    }
}
