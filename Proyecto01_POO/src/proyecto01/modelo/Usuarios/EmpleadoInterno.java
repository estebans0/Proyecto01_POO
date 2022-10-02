package proyecto01.modelo.Usuarios;

public class EmpleadoInterno extends Usuario{
    
    // Atributos
            
    // Métodos
    public EmpleadoInterno() {
        super();
        nombre = "No especificado";
        id = "EI0";
        contrasenna = "No especificada";
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + '}';
    }
    
}
