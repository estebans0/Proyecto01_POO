package proyecto01.modelo.Usuarios;

public class Administrador extends Usuario {
    
    // Atributos
            
    // Métodos
    public Administrador() {
        super();
        nombre = "Administador";
        id = "AD0";
        contrasenna = "2345";
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + '}';
    }
    
}
