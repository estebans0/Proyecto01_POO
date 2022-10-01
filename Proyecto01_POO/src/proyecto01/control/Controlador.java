/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01.control;

import proyecto01.modelo.Usuario;
import proyecto01.modelo.Areas.Area;
import proyecto01.modelo.Areas.NivelPiso;
import proyecto01.modelo.Elementos.Elemento;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ersolano
 */
public class Controlador {
    
    private ListaUsuarios usuarios;
    private ListaAreas areas;

    public Controlador() {
        usuarios = new ListaUsuarios();
        areas = new ListaAreas(); 
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

    public ListaAreas getAreas() {
        return areas;
    }

    public void setAreas(ListaAreas areas) {
        this.areas = areas;
    }
    
    public Area consultarArea(String codigo){
        for (int i =0; i< areas.cantidadAreas(); i++){
            Area a = areas.consultarAreaa(codigo);
            if (a != null && a.getCodigo().equalsIgnoreCase(codigo))
                return a;
        }
        return null;
    }
    
    public boolean agregarArea( String codigo, String nombre, String descripcion, NivelPiso nivel){
        Area a = new Area(codigo, nombre, descripcion, nivel);
        if(!areas.consultarArea(codigo)){
            areas.agregarArea(a);
            return true;
        }
        return false;
    }
    
    public boolean agregarElementoArea(String codigo, Elemento e){
        Area a = areas.consultarAreaa(codigo);
        if(a!= null){
            a.agregarElemento(e);
            return true;
        }
        return false;
    }
    
    public boolean consultarElementoArea(String codArea, String codEle){
        Area a = areas.consultarAreaa(codArea);
        if (a != null){
           return a.consultarElemento(codEle);
        }
        return false;
    }
    
    public Elemento consultarElementoeArea(String codArea, String codEle){
        Area a = areas.consultarAreaa(codArea);
        if (a != null){
           return a.consultarElementoe(codEle);
        }
        return null;
    }
    
    public String mostrarAreas(){
        return areas.mostrarAreas();
    }

}
