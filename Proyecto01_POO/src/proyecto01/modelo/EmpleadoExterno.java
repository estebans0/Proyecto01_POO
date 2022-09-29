package proyecto01.modelo;

public class EmpleadoExterno extends Usuario{
    
    // Atributos
            
    // Métodos
    public EmpleadoExterno() {
        super();
        nombre = "No especificado";
        id = "EE0";
        contrasenna = "No especificada";
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + 
                ", contrasenna=" + contrasenna + '}';
    }

}
