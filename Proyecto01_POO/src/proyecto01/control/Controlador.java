/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01.control;

import proyecto01.modelo.Usuarios.Usuario;
import proyecto01.modelo.Usuarios.SuperUsuario;
import proyecto01.modelo.Usuarios.Administrador;
import proyecto01.modelo.Usuarios.EmpleadoExterno;
import proyecto01.modelo.Usuarios.EmpleadoInterno;
import proyecto01.modelo.Areas.Area;
import proyecto01.modelo.Areas.NivelPiso;
import proyecto01.modelo.Elementos.Elemento;

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
    
    public boolean logInEmpleados(String correo, String contrasenna){
        return usuarios.consultarLogInEmpleados(correo, contrasenna);
    }
    
    public boolean logInAdministracion(String id, String contrasenna){
        return usuarios.consultarLogInAdministracion(id, contrasenna);
    }

    public ListaUsuarios getUsuarios() {
        return usuarios;
    }
    
    public boolean agregarUsuario(String id, String nombre, String correo, String contrasenna, String detalle) {
        String codID = usuarios.obtenerCodId(id);
        if ("AD".equals(codID)) {
            Usuario unUsuario = new Administrador(id, nombre, contrasenna);
            return usuarios.agregarUsuario(unUsuario);
        } else if ("EI".equals(codID)) {
            Usuario unUsuario = new EmpleadoInterno(id, nombre, contrasenna, correo);
            return usuarios.agregarUsuario(unUsuario);
        } else if ("EE".equals(codID)) {
            Usuario unUsuario = new EmpleadoExterno(id, nombre, contrasenna, correo, detalle);
            return usuarios.agregarUsuario(unUsuario);
        } else {
            return false;
        }
    }
    
    public boolean agregarSU() {
        Usuario unUsuario = new SuperUsuario();
        return usuarios.agregarUsuario(unUsuario);
    }
    
    public boolean agregarAD(String id, String nombre, String contrasenna) {
        String codID = usuarios.obtenerCodId(id);
        if ("AD".equals(codID)) {
            Usuario unUsuario = new Administrador(id, nombre, contrasenna);
            return usuarios.agregarUsuario(unUsuario);
        } else {
            return false;
        }
    }
    
    public boolean agregarEI(String id, String nombre, String correo, String contrasenna) {
        String codID = usuarios.obtenerCodId(id);
        if ("EI".equals(codID)) {
            Usuario unUsuario = new EmpleadoInterno(id, nombre, contrasenna, correo);
            return usuarios.agregarUsuario(unUsuario);
        } else {
            return false;
        }
    }
    
    public boolean agregarEE(String id, String nombre, String correo, String contrasenna, String detalle) {
        String codID = usuarios.obtenerCodId(id);
        if ("EE".equals(codID)) {
            Usuario unUsuario = new EmpleadoExterno(id, nombre, contrasenna, correo, detalle);
            return usuarios.agregarUsuario(unUsuario);
        } else {
            return false;
        }
    }
    
    public boolean eliminarUsuario(String id) {
        return usuarios.eliminarUsuario(id);
    }

    public String mostrarEmpleadosTipo(int opcion) {
        return usuarios.mostrarEmpleadosTipo(opcion);
    }
    
    public boolean modificarUsuario(String id, String contrasenna) {
        Usuario elUsuario = usuarios.consultarUsuario(id);
        if (elUsuario != null) {
            elUsuario.setContrasenna(contrasenna);
            return usuarios.modificarUsuario(elUsuario);
        }
        return false;
    }
    
    public Usuario consultarUsuario(String id){
        return usuarios.consultarUsuario(id);
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
   
    public String mostrarElementos(){
        return areas.mostrarElementos();
    }
    public String areasElementosAceptables(){
        String aceptables = "ELEMENTOS ACEPTABLES DE TODAS LAS AREAS"+"\n";
        for(int i =0; i<areas.cantidadAreas(); i++){
            Elemento elemActual = areas.elementosEstadoAceptable().get(i);
            aceptables += elemActual.toString();
        }
        return aceptables;
    }
     public String areasElementosDañosMedios(){
        String medios = "ELEMENTOS CON DAÑOS MEDIOS DE TODAS LAS AREAS"+"\n";
        for(int i =0; i<areas.cantidadAreas(); i++){
            Elemento elemActual = areas.elementosEstadoDañoMedio().get(i);
            medios += elemActual.toString();
        }
        return medios;
    }
    
    public String areasElementosDañosImportantes(){
        String importantes = "ELEMENTOS CON DAÑOS IMPORTANTES DE TODAS LAS AREAS"+"\n";
        for(int i =0; i<areas.cantidadAreas(); i++){
            Elemento elemActual = areas.elementosEstadoDañoImportante().get(i);
            importantes += elemActual.toString();
        }
        return importantes;
    }
}
