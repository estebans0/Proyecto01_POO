/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01.control;

import proyecto01.modelo.Usuario;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ersolano
 */
public class Controlador {
    
    private ListaUsuarios usuarios;

    public Controlador() {
        usuarios = new ListaUsuarios();
    }

    public ListaUsuarios getUsuarios() {
        return usuarios;
    }
    
    public boolean agregarUsuario(int id, String nombre, String correo, String contrasenna){
        
        //Falta seleccionar el tipo de usuario
        
        Usuario unUsuario = new Usuario(id, nombre, correo, contrasenna);
        return usuarios.agregarUsuario(unUsuario);
    }

    public Usuario consultarUsuario(int id) {
        return usuarios.consultarUsuario(id);
    }
    
         
    public boolean modificarUsuario(int id, String nombre, String correo, String contrasenna) {
        Usuario elUsuario = usuarios.consultarUsuario(id);
        if (elUsuario != null) {
            elUsuario.setNombre(nombre);
            elUsuario.setCorreo(correo);
            return usuarios.modificarUsuario(elUsuario);
        }
        return false;
    }

}
