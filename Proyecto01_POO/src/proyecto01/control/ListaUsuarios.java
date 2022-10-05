package proyecto01.control;

import proyecto01.modelo.Usuarios.Usuario;
import java.util.ArrayList;

public class ListaUsuarios {
    
    private ArrayList <Usuario> lista;

    public ListaUsuarios() {
        lista = new ArrayList<Usuario> ();
    }
    
    public int size(){
        return lista.size();
    }
    
    public String obtenerCodId(String id) {
        String codigo = "";
        for (int i = 0; i < 2; i++) {
            codigo += id.charAt(i);
        }
        return codigo;
    }
    
    public boolean agregarUsuario(Usuario unUsuario){
        for (int i = 0; i < lista.size(); i++) {
            Usuario usuarioActual = lista.get(i);
            if (usuarioActual.getId().equals(unUsuario.getId()) )
            {
                return false;
            }
        }        
        lista.add(unUsuario);
        return true;
    }
    
    public boolean eliminarUsuario(String id){
        Usuario unUsuario = consultarUsuario(id);
        if (unUsuario != null){
            lista.remove(unUsuario);
            return true;
        }
        return false;
    }
    
    public boolean modificarUsuario(Usuario unUsuario){
        for (int i = 0; i < lista.size(); i++) {
            Usuario actual = lista.get(i);
            if (actual.getId().equals(unUsuario.getId()) ){
                lista.set(i, unUsuario);
                return true;
            }
        }
        return false;
    }
    
    public Usuario consultarUsuario(String id){
        for (Usuario usuario : lista) 
            if (usuario.getId().equals(id))
                return usuario;
        return null;
    }
    
    public boolean consultarLogInEmpleados(String correo, String contrasenna){
        for (Usuario usuario : lista)
            if (usuario.getCorreo().equals(correo) && usuario.getContrasenna().equals(contrasenna))
                return true;
        return false;
    }
    
    public boolean consultarLogInAdministracion(String id, String contrasenna){
        for (Usuario usuario : lista)
            if (usuario.getId().equals(id) && usuario.getContrasenna().equals(contrasenna))
                return true;
        return false;
    }

    public String mostrarEmpleadosTipo(int opcion) {
        String respuesta = "";
        for (Usuario usuario : lista) {
            String codID = obtenerCodId(usuario.getId());
            if (opcion == 0) {
                if ("EI".equals(codID))
                    respuesta += usuario.toString() + "\n";
            } else if (opcion == 1) {
                if ("EE".equals(codID))
                    respuesta += usuario.toString() + "\n";
            } else {
                if ("EE".equals(codID) || "EI".equals(codID))
                    respuesta += usuario.toString() + "\n";
            }
        }
        return respuesta;
    }
    
    public String mostrarUsuarios() {
        String respuesta = "";
        for (Usuario usuario : lista) {
            respuesta += usuario.toString() + "\n";
        }
        return respuesta;
    }
}
