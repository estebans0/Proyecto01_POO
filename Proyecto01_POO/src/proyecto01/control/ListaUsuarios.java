package proyecto01.control;

import proyecto01.modelo.Usuario;
import java.util.ArrayList;

public class ListaUsuarios {
    
    private ArrayList <Usuario> lista;

    public ListaUsuarios() {
        lista = new ArrayList<Usuario> ();
    }
    
    public boolean agregarUsuario(Usuario unUsuario){
        
        // Falta forma de saber si soy el superusuario
        
        for (int i = 0; i < lista.size(); i++) {
            Usuario usuarioActual = lista.get(i);
            if (usuarioActual.getId() == unUsuario.getId() )
            {
                return false;
            }
        }        
        lista.add(unUsuario);
        return true;
    }
    
    public boolean consultarExisteUsuario(int id){
        int pos = 0;
        while (pos < lista.size()){
            Usuario usuarioActual = lista.get(pos);
            if (usuarioActual.getId() == id)
                return true;
            else
                pos += 1;
        }
        return false;
    }
    
    public Usuario consultarUsuario(int id){
        for (Usuario usuario : lista) 
            if (usuario.getId() == id)
                return usuario;
        return null;    
    }

    public boolean modificarUsuario(Usuario unUsuario){
        for (int i = 0; i < lista.size(); i++) {
            Usuario actual = lista.get(i);
            if (actual.getId() == unUsuario.getId() ){
                lista.set(i, unUsuario);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarUsuario(int id){
            Usuario unUsuario = consultarUsuario(id);
        if (unUsuario != null){
            lista.remove(unUsuario);
            return true;
        }
        return false;    
    }
    
    public String mostrarUsuarios() {
        String respuesta = "";
        for (Usuario usuario : lista) {
            respuesta += usuario.toString() + "\n";
        }
        return respuesta;
    }   
}
